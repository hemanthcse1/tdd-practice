package com.hemanth.tddpractice.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PersonMainClass {

    public static void main(String[] args) {

        // nullPointerCheck();

        useFilterAndMap();

    }

    private static void useFilterAndMap() {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Rahul", 32, "Product manager"));
        personList.add(new Person("Hemanth", 31, "SDE2"));
        personList.add(new Person("Kiran", 26, "Manager"));
        personList.add(new Person("Teja", 21, "Student"));


        List<Person> filteredPersons = personList.stream()
                .filter(person ->
                    person.getAge() > 30
                ).collect(Collectors.toList());


        for (Person person : filteredPersons) {
            System.out.println(person);
        }


    }

    public static void nullPointerCheck() {

        Person person = new Person(null, 31, "SE");
        Optional<Person> personOptional = Optional.ofNullable(person);
        personOptional.ifPresent(p -> {
            Optional<String> name = Optional.ofNullable(p.getName());
            String upperCaseName = name.map(String::toUpperCase).orElse("Empty Name");
            System.out.println(upperCaseName);
        });
    }
}

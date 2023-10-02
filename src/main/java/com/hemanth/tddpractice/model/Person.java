package com.hemanth.tddpractice.model;

public class Person {

    private String name;
    private Integer age;
    private String designation;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", designation='" + designation + '\'' +
                '}';
    }

    public Person(String name, Integer age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getDesignation() {
        return designation;
    }
}

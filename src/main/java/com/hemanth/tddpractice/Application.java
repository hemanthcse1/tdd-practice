package com.hemanth.tddpractice;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /*@Bean
    CommandLineRunner commandLineRunner(JdbcConnectionDetails jdbc){
        return args -> {
            var details = STR."""
                    class:\{jdbc.getClass().getName()}
                    
                    """;
        };
    }*/

}

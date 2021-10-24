package com.example.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student nitin = new Student(
                "Kunal",
                "kunalvishwari@gmail.com",
                LocalDate.of(1997, Month.JANUARY, 5)

            );
            Student chinni = new Student(
                    "Chinni",
                    "chinni@gmail.com",
                    LocalDate.of(1996, Month.JANUARY, 5)
            );

            repository.saveAll(
                    List.of(nitin, chinni)
            );
        };
    }
}

package com.example.demo;

import com.example.demo.domain.CarRepository;
import org.slf4j.Logger; //logs output to the console
import org.slf4j.LoggerFactory; //logs output to the console
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.domain.CarInfo;
import com.example.demo.domain.CarRepository;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CarShop {
    private static final Logger log = LoggerFactory.getLogger(CarShop.class);
    public static void main(String[] args) {
        SpringApplication.run(CarShop.class, args);
    }

    @Bean
    public CommandLineRunner demo(CarRepository repository){
        return args ->{
            //save a couple cars
            repository.save(new CarInfo("Dodge", "Charger", 2019));
            repository.save(new CarInfo("Lambo", "Aventador", 2020));
            repository.save(new CarInfo("Bugatti", "Chiron", 2021));

            //read all cars
            log.info("Car found with findAll() : ");
            log.info("---------------------------------");
            for(CarInfo car : repository.findAll()) {
                log.info(car.toString());
            }
            log.info("");

            //read an individual car by Year
            repository.findById(1L)
                    .ifPresent(car -> {
                        log.info("Car found with findByYear(1L) : ");
                        log.info("-----------------------------------");
                        log.info(car.toString());
                        log.info("");
                    });

            //read cars by model
            log.info("Car found with findByModel('Charger') : ");
            log.info("----------------------------------");
            repository .findByModel("Charger").forEach(bauer -> {
                log.info(bauer.toString());
            });
        };
    }

}

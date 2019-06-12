package com.example.demo.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepository extends CrudRepository<CarInfo, Long> {

    List<CarInfo> findByModel(String model);
}


package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //lets springBoot know that customer classes are an entity stored in dataBase. Also indicates that customer is jpa entity. Assumed entity will be mapped to a table named customer.
public class CarInfo {

    public CarInfo(String make, String model, Integer year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private Integer year;
    private String make;
    private String model;





    @Override
    public String toString() {
        return "CarInfo{" +
                "id=" + Id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                '}';
    }

    private CarInfo(){
        //Entity needs a no-argument constructor
    }//end of of private CustomerInfo


}//end of class CustomerInfo

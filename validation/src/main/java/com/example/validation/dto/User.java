package com.example.validation.dto;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import java.util.List;

public class User {

    @NotBlank
    private String name;

    @Max(value = 90)
    private int age;

    private String email;

    @Valid
    private List<Car> cars;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", cars=" + cars +
                '}';
    }
}

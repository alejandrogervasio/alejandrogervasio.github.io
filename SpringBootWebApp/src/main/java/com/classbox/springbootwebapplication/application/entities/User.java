package com.classbox.springbootwebapplication.application.entities;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {

    @NotNull(message = "Name may not be null")
    @Size(min = 2, max = 30, message = "Name must between 2 and 30 characters")
    private String name;

    @NotNull(message = "Age may not be null")
    @Min(18)
    private Integer age;
    
    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "User{" + "name=" + name + ", age=" + age + '}';
    }
}

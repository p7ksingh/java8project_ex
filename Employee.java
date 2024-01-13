package com.exception.handling;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private int id;
    private String name;
    private int age;
    private String Gender;
    private String department;
    private int yearOfJoining;
    private double salary;
}

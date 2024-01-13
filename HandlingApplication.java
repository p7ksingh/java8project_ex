package com.exception.handling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HandlingApplication {

	public static void main(String[] args) {
		SpringApplication.run(HandlingApplication.class, args);
  List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        // Repeat the pattern for additional employees
        employeeList.add(new Employee(255, "Megan Johnson", 28, "Female", "Product Development", 2015, 30000.0));
        employeeList.add(new Employee(266, "Raj Sharma", 29, "Male", "Infrastructure", 2011, 25000.0));
        employeeList.add(new Employee(277, "Emily Smith", 26, "Female", "Product Development", 2018, 32000.0));
        employeeList.add(new Employee(288, "Vincent Lee", 30, "Male", "Account And Finance", 2014, 27000.0));
        employeeList.add(new Employee(299, "Sophie Brown", 32, "Female", "Sales And Marketing", 2016, 18000.0));
        employeeList.add(new Employee(310, "Daniel White", 28, "Male", "Product Development", 2013, 34000.0));
        employeeList.add(new Employee(321, "Aisha Patel", 25, "Female", "Infrastructure", 2017, 20000.0));
        employeeList.add(new Employee(332, "Chris Johnson", 27, "Male", "Product Development", 2019, 38000.0));
        employeeList.add(new Employee(343, "Eva Williams", 29, "Female", "Account And Finance", 2012, 26000.0));
        employeeList.add(new Employee(354, "Jason Davis", 24, "Male", "Sales And Marketing", 2015, 15000.0));
        employeeList.add(new Employee(365, "Olivia Taylor", 26, "Female", "Product Development", 2016, 31000.0));
        employeeList.add(new Employee(376, "Alex Turner", 30, "Male", "Infrastructure", 2018, 23000.0));
        employeeList.add(new Employee(387, "Nina Patel", 28, "Female", "Product Development", 2014, 36000.0));
        employeeList.add(new Employee(398, "Ryan Garcia", 27, "Male", "Account And Finance", 2011, 28000.0));
        employeeList.add(new Employee(409, "Emma Miller", 25, "Female", "Sales And Marketing", 2017, 19000.0));
        employeeList.add(new Employee(420, "Michael Clark", 31, "Male", "Product Development", 2015, 33000.0));
        // Q1. How many male and female employees are there in orization?

	}

}

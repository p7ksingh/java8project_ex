package com.exception.handling;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MainTest {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
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
        System.out.println("=".repeat(40));
        // Q1. How many male and female employees are there in orization?
        // method1(employeeList);

        // Q2. Print the name of all department in the organization ?
        // method2(employeeList);

        // Q3. what is average age of male and female employee ?
        // method3(employeeList);

        // Q4. Get details of higest paid employee in the origination ?
        // method4(employeeList);

        // Q5. Get the name of all employee who have join after 2015 ?
        // method5(employeeList);

        // Q6. Count the no of employee in each department ?
        // method6(employeeList);

        // Q7. What is average salary of each department ?
        // method7(employeeList);

        // Q8. Get the details of youngest male employee in the product development
        // department ?
        // method8(employeeList);

        // Q9. Who has the most working experience in the origination ?
        // method9(employeeList);

        // Q10. How many male and female employee are there in the sales and marketing
        // team ?
        // method10(employeeList);

        // Q11. What is the average salary of male and female employees?
        // method11(employeeList);

        // Q12. List down the names of all employees in each department ?
        // method12(employeeList);

        // Q13. What is the average salary and total salary of the whole organization ?
        // method13(employeeList);

        // Q14. Seperate the employees who are younger or equal to 25 years from those
        // employees who are older then 25 years ?
        // method14(employeeList);

        // Q15. who is the oldest employee in the origanizatiion ? what is his age and
        // which department he belongs to ?
        method15(employeeList);

    }

    private static void method15(List<Employee> employeeList) {
        System.out.println(
                "Q15. who is the oldest employee in the origanizatiion ? what is his age and which department he belongs to ?");
        Employee employee = employeeList.stream().max(Comparator.comparingInt(Employee::getAge)).get();
        System.out.println(employee.getName());
        System.out.println(employee.getAge());
        System.out.println(employee.getDepartment());

    }

    private static void method14(List<Employee> employeeList) {
        System.out.println(
                "Q14. Seperate the employees who are younger or equal to 25 years from those employees who are older then 25 years ?");
        Map<Boolean, List<Employee>> ageFilter = employeeList.stream()
                .collect(Collectors.partitioningBy(dt -> dt.getAge() > 25));
        System.out.println("age more than 25 years" + ageFilter.get(true));
        System.out.println("age less than 25 years" + ageFilter.get(false));
    }

    private static void method13(List<Employee> employeeList) {
        System.out.println("Q13. What is the average salary and total salary of the whole organization ?");
        DoubleSummaryStatistics salary = employeeList.stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println(salary.getAverage());
        System.out.println(salary.getSum());
    }

    private static void method12(List<Employee> employeeList) {
        System.out.println("Q12. List down the names of all employees in each department ?");
        Map<String, List<String>> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println(collect);
    }

    private static void method11(List<Employee> employeeList) {
        System.out.println("Q11. What is the average salary of male and female employees?");
        Map<String, Double> avgSalGender = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(avgSalGender);
    }

    private static void method10(List<Employee> employeeList) {
        System.out.println("How many male and female employee are there in the sales and marketing team ?");
        Map<String, Long> mapAge = employeeList.stream().filter(dt -> dt.getDepartment().equals("Sales And Marketing"))
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(mapAge);
    }

    private static void method9(List<Employee> employeeList) {
        System.out.println("Q9. Who has the most working experience in the origination ?");
        Optional<Employee> first = employeeList.stream().sorted(Comparator.comparing(Employee::getYearOfJoining))
                .findFirst();
        System.out.println(first);
    }

    private static void method8(List<Employee> employeeList) {
        System.out.println("Q8. Get the details of youngest male employee in the product development department ?");
        Optional<Employee> minAge = employeeList.stream().filter(dt -> dt.getDepartment().equals("Product Development"))
                .min(Comparator.comparing(Employee::getAge));
        System.out.println(minAge);
    }

    private static void method7(List<Employee> employeeList) {
        System.out.println("What is average salary of each department ?");
        Map<String, Double> avgSal = employeeList.stream().collect(
                Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avgSal);
    }

    private static void method6(List<Employee> employeeList) {
        System.out.println("Q6. Count the no of employee in each department ?");
        employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())).entrySet().stream()
                .forEach(System.out::println);
        System.out.println("=".repeat(40));
    }

    private static void method5(List<Employee> employeeList) {
        System.out.println(" Q. Get the name of all employee who have join after 2015 ?");
        employeeList.stream().filter(dt -> dt.getYearOfJoining() > 2015).map(dt -> dt.getName())
                .forEach(System.out::println);

        System.out.println("=".repeat(40));
    }

    private static void method4(List<Employee> employeeList) {
        System.out.println("Get details of higest paid employee in the origination ?");
        Employee employee = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)))
                .get();
        System.out.println(employee);
        System.out.println("=".repeat(40));
    }

    private static void method3(List<Employee> employeeList) {
        System.out.println("what is average age of male and female employee ?");
        Map<String, Double> avgAge = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println(avgAge);
        System.out.println("=".repeat(40));
    }

    private static void method2(List<Employee> employeeList) {
        employeeList.stream()
                .map(dt -> dt.getDepartment()).forEach(System.out::println);
        System.out.println("=".repeat(40));
    }

    private static void method1(List<Employee> employeeList) {
        System.out.println("Q1. How many male and female employees are there in orization?");
        Map<String, Long> maleAndfemale = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        System.out.println(maleAndfemale);
        System.out.println("=".repeat(40));
    }

}

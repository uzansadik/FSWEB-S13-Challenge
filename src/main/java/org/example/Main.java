package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        testEmployee();
        testCompany();
        testPlan();
    }

    public static void testEmployee() {
        String[] healtplans = new String[4];
        Employee employee = new Employee(1, "Sadık Uzan", "123456", "sadik@uzan.org", healtplans);
        employee.addHealthPlan(0, "Hayat Sigortası");
        employee.addHealthPlan(1, "Yangın Sigortası");
        employee.addHealthPlan(2, "Kaza Sigortası");
        employee.addHealthPlan(3, "Zorunlu Trafik Sigortası");
        System.out.printf(employee.toString());
    }

    public static void testCompany() {
        String[] names = new String[3];
        Company company = new Company(1, "Workintech", 15000, names);
        company.addEmployee(0, "Sadık Uzan");
        company.addEmployee(1, "Mehmet");
        company.addEmployee(2, "Ahmet");
        System.out.printf(company.toString());
    }

    public static void testPlan() {
        Healthplan healthplan = new Healthplan(1,"Test Healthplan", Plan.BASIC);
        System.out.printf(healthplan.toString());
    }
}
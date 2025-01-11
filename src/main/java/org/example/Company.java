package org.example;

public class Company {
    private String name;
    private int id;
    private double giro;
    private String[] developerNames;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Never used
    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        this.giro = Math.max(giro, 0);
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public Company(int id, String name,  double giro, String[] developerNames) {
        setName(name);
        setId(id);
        setGiro(giro);
        setDeveloperNames(developerNames);
    }

    public void addEmployee(int index, String name) {
        index = Math.max(index, 0);
        if (developerNames[index] == null) {
            developerNames[index] = name;
        }else {
            System.out.println("This index is already taken");
        }
    }

    @Override
    public String toString() {
        return "Company Name: " + getName() + "\n" +
                "Company ID: " + getId() + "\n" +
                "Company Giro: " + getGiro() + "\n" +
                "Company Developers: " + String.join(", ", developerNames);
    }
}

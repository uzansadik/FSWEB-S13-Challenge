package org.example;

import org.example.enums.Plan;

public class Healthplan {
    private int id;
    private String name;
    private Plan plan;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public Healthplan(int id, String name, Plan plan) {
        setId(id);
        setName(name);
        setPlan(plan);
    }

    @Override
    public String toString() {
        return "Healthplan Id: " + getId() + "\n" +
                "Healthplan Name: " + getName() + "\n" +
                "Healthplan Plan: " + getPlan() + "\n" +
                "price: " + getPlan().getPrice();
    }


}

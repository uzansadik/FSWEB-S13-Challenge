package org.example;

public class Employee {

    private long id;
    private String fullName;
    private String password;
    private String email;

    private String[] healthPlans;

    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }

    public void setHealthPlans(String[] healthPlans) {
        this.healthPlans = healthPlans;
    }



    public Employee(long id, String fullName, String password, String email, String[] plans) {
        setId(id);
        setFullName(fullName);
        setPassword(password);
        setEmail(email);
        setHealthPlans(plans);
    }


    public void addHealthPlan(int index, String name) {
        if (index >= healthPlans.length){
            System.out.println("exceeded the limit");
            return;
        }
        index = Math.max(index, 0);
        if (healthPlans[index] == null) {
            healthPlans[index] = name;
        }else {
            System.out.println("Index is already taken!");
        }
    }

    @Override
    public String toString() {
        StringBuilder healthPlanString = new StringBuilder();
        for (String plan : healthPlans) {
            healthPlanString.append(plan).append("\n");
        }
        return  "Id: " + getId() + "\n" +
                "Name Surname: " + getFullName() + "\n" +
                "Email: " + getEmail() + "\n" +
                "Password: " + getPassword()+ "\n" +
                "Insurances \n" +
                healthPlanString;

    }
}



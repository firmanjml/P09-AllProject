package sg.edu.rp.c346.listview.excercise2.model;

public class Employee {
    private String name;
    private String job;
    private double salary;

    public Employee(String name, String job, double salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }



    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public double getSalary() {
        return salary;
    }


}

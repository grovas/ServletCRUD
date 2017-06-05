package model;

public class Worker {
    private String lastName;
    private String firstName;
    private int age;
    private double salary;
    private long id;

    public Worker (){}

    public Worker(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Worker(String lastName, String firstName, int age, double salary, long id) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.salary = salary;
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        id = id;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", id=" + id +
                '}';
    }
}
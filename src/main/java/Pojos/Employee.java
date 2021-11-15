package Pojos;

public class Employee {
    private String name;
    private String gender;
    private int age;
    private int id;
    private int salary;
    private String position;

    public Employee(String name, String gender, int age, int id, int salary, String position) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.salary = salary;
        this.position = position;
    }

    public Employee(String name, String gender, int age, int id) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}

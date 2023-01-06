package com.assignment.bean;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection="employees")
public class Employee {
    @Id
    private int id;
    private String name;
    private String depart;
    private String disgn;
    private double salary;
    
    public Employee() {
        super();    
    }
    
    public Employee(int id, String name, String dept, String desgn, double salary) {
        super();
        this.id = id;
        this.name = name;
        this.depart = dept;
        this.disgn = desgn;
        this.salary = salary;
    }



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



   public String getDepart() {
        return depart;
    }



   public void setDept(String depart) {
        this.depart = depart;
    }



   public String getDisgn() {
        return disgn;
    }



   public void setDisgn(String desgn) {
        this.disgn = desgn;
    }



   public double getSalary() {
        return salary;
    }



   public void setSalary(double salary) {
        this.salary = salary;
    }



   @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", depart=" + depart + ", disgn=" + disgn + ", salary=" + salary
                + "]";
    }
    
    



}


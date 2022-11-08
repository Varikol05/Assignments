package com.assignments;
class Employee1
{
    Integer id;
    String name;
    String department;
    int salary;
    Employee1(Integer id,String name,String department,int salary)
    {
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary=salary;
    }
@Override
public String toString()
{
     return "Treeset{" +
             "id=" + id +", name='" + name + '\'' +
             ", department='" + department + '\'' +
             ", salary=" + salary +
             '}';
}
}


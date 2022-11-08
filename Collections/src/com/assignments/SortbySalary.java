package com.assignments;

import java.util.Comparator;

class Sortbysalary implements Comparator<Employee1>



{
    public int compare(Employee1 a, Employee1 b)



{
     return a.salary - b.salary;
}}
package com.cg.demo.select;

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;
class Employee {
    String name;
    int salary;

    Employee(){
        //Default
    }

    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public int getSalary(){
        return salary;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append("name: ");
        sb.append(name);
        sb.append(" salary: ");
        sb.append("" + salary+">");
        return sb.toString();

    }
}
class EmployeeInfo{
    public List<Employee> sort(List<Employee> emp, final SortMethod method){
        switch(method){
        case BYNAME:
        Collections.sort(emp,(e1,e2)-> e1.getName().compareTo(e2.getName()));
        break;
        case BYSALARY:
        Collections.sort(emp,(e1,e2)->(e1.getSalary()>e2.getSalary())?1:-1);
        break;
        }
     return emp;
    }
    public boolean isCharacterPresentInAllNames(Collection<Employee> entities, String character){
        return entities.stream().allMatch((emp)->emp.name.contains(character));
    }
    enum SortMethod {
                BYNAME, BYSALARY;

    };
}
package org.test;

public class Employee {
    // присвоили переменные классу
    String name;
    int age;
    String designation;
    double salary;

    //создаем конструктор для класса Employee - далее используется для создания нового работника.
    // и имя будет передано в качестве аргумента в скобках.

    public Employee (String name) {
        this.name = name;
    }

    //присвоение возраста работника в вызываемом методе
    public void empAge(int empAge) {
        age = empAge;
    }
    //присвоение переменной designation в вызываемом методе

    public void empDesignation (String empDesign) {
        designation = empDesign;
    }

    public void empSalary (double empSalary) {
        salary = empSalary;

    }

    public void printInfo () {
        System.out.println("Вымя :" + name);
        System.out.println("Возраст :" + age);
        System.out.println("Описание :" + designation);
        System.out.println("Зарплата :" + salary);
    }



}

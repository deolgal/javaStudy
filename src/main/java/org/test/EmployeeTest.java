package org.test;

public class EmployeeTest {
    public static void main(String[] args) {
        /*Создание объектов при помощи конструктора. тут мы создаем нового работника по
      конструктору описанному в классе Employee.java*/

        Employee empOne = new Employee("Олег Иванов");
        Employee empTwo = new Employee("Василий Пупкин");

        //так вызываются методы в Java.

        empOne.empAge(26);
        empOne.empSalary(452389.00);
        empOne.empDesignation("Дворник");
        empOne.printInfo();

        empTwo.empAge(98);
        empTwo.empSalary(100000.00);
        empTwo.empDesignation("Пенс-везунчик");
        empTwo.printInfo();
    }
}
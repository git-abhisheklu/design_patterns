package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.printf("Singleton design pattern \n");
        Student result=Student.getStudent();
        System.out.println(result.hashCode());

        Student result1=Student.getStudent();
        System.out.println(result1.hashCode());

        Student result2=Student.getStudent();
        System.out.println(result2.hashCode());
    }

}
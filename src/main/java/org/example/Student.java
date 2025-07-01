/* Creational Patterns - (It deals with the object creation mechanism.)
* 1. Singleton Design Pattern
* 2. Factory Design Pattern
* 3. Abstract Factory Design Pattern
* 4. Builder Design Pattern
* 5. Prototype Design Pattern */

package org.example;

public class Student {
    private Long studentId;
    private String name;
    private Integer age;

    private static Student student;

//    Eager initialization of Singleton Object
//    private static final Student student=new Student();
//
//    public static Student getStudent(){
//        return student;
//    }

    public Long getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private Student(){}

//    Lazy initialization of Singleton Object.

    public static Student getStudent(){
        if(student!=null) {
            return student;
        }
        student=new Student();
        System.out.println("Student object is being created.");
        return student;
    }

//    Ways to break Singleton Design Pattern
//    1. Using Reflection API
//    2. Using Serialization and Deserialization
//    3. Using Object Cloning
}

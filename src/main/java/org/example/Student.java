package org.example;

public class Student {
    private Long studentId;
    private String name;
    private Integer age;

//    Eager initialization of Singleton Object
    private static final Student student=new Student();

    public static Student getStudent(){
        return student;
    }

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

//    public static Student getStudent(){
//        if(student!=null) {
//            return student;
//        }
//        student=new Student();
//        System.out.println("Student object is being created.");
//        return student;
//    }

}

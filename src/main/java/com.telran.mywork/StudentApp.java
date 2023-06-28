package com.telran.mywork;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext worker = new ClassPathXmlApplicationContext("bean-factory-demo.xml");
        Student student = (Student) worker.getBean("student");
        student.setAge(18);
        student.setName("Oleh");
        System.out.println("Student from empty constructor: " + student.getName() + ", who is " + student.getAge() + " years old.");
        Student studentPar = (Student) worker.getBean("studentWithParameters");
        System.out.println("Student from constructor with parameters: "
                + studentPar.getName() + ", who is " + studentPar.getAge() + " years old.");

        Teacher teacher = (Teacher) worker.getBean("teacher");
        teacher.setName("Anna");
        teacher.setAge(48);
        System.out.println("Teacher with @Component: "
                + teacher.getName() + ", who is " + teacher.getAge() + " years old.");
    }
}

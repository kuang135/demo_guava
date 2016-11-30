package com.demo.guava.g1_objects;

import org.junit.Test;

public class ObjectsTest {
	

    @Test
    public void StudentTest(){
        
        Student student=new Student("peida",23,80);
        Student student1=new Student("aida",23,36);
        Student student2=new Student("jerry",24,90);
        Student student3=new Student("peida",23,80);
        
        System.out.println("==========equals===========");
        System.out.println(student.equals(student2));
        System.out.println(student.equals(student1));
        System.out.println(student.equals(student3));
        
        System.out.println("==========hashCode===========");
        System.out.println(student.hashCode());
        System.out.println(student1.hashCode());
        System.out.println(student3.hashCode());
        System.out.println(student2.hashCode());
        
        System.out.println("==========toString===========");
        System.out.println(student.toString());
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
        
        System.out.println("==========compareTo===========");
        System.out.println(student.compareTo(student));
        System.out.println(student1.compareTo(student2));
        System.out.println(student2.compareTo(student1));
        
    }

}

package com.demo.guava.g1_objects;


import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Ordering;

public class Student implements Comparable<Student>{
	
    public String name;
    public int age;
    public int score;
    
    public Student() {
    }
    
    public Student(String name, int age,int score) {
        this.name = name;
        this.age = age;
        this.score=score;
    }
    
    @Override
    public int hashCode() {
        return Objects.hashCode(name, age);
    }
    
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student that = (Student) obj;
            return Objects.equal(name, that.name)
                    && Objects.equal(age, that.age)
                    && Objects.equal(score, that.score);
        }
        return false;
    }
    
    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .addValue(name)
                .addValue(age)
                .addValue(score)
                .toString();
    }
    
    @Override
    public int compareTo(Student other) {
        return ComparisonChain.start()
        		.compare(name, other.name)
        		.compare(age, other.age)
        		.compare(score, other.score, Ordering.natural().nullsLast())
        		.result();
    }
}

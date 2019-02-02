package com.jason.student;

public class Student {
    String id;   //
    String name; //
    int english; //
    int math;    //attribute 會給初值
    public Student(){
        super();
    }

    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }
    public void print(){
        System.out.println(name + "\t" + english + "\t" + math + "\t" + (english+math)/2);
    }
}

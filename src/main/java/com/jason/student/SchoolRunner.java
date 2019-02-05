package com.jason.student;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter user's name : ");
        String name = sc.next();
        System.out.print("Please enter user's english score : ");
        int english = sc.nextInt();
        System.out.print("Please enter user's math score : ");
        int math = sc.nextInt();
        Student stu = new Student(name,english,math);
        stu.print();

    }
}

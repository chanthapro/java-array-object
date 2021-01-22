package com.company;

import java.util.Scanner;

public class Student extends Person{

    Scanner scan = new Scanner(System.in);


    private String grade;
    private String score;


    public Student(String id, String name, String address, String email, String grade, String score) {
        super(id, name, address, email);
        this.grade = grade;
        this.score = score;
    }

    public Student(String grade, String score) {
        this.grade = grade;
        this.score = score;
    }

    public Student() {
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public void setData() {
        super.setData();

        System.out.print("Enter Grade : ");
        setGrade(scan.nextLine());

        System.out.print("Enter Score : ");
        setScore(scan.nextLine());
    }
}

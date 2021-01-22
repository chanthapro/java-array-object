package com.company;

public class Teacher extends Person{

    private String classManage;


    public Teacher(String id, String name, String address, String email, String classManage) {
        super(id, name, address, email);
        this.classManage = classManage;
    }

    public Teacher(String classManage) {
        this.classManage = classManage;
    }

    public Teacher() {
    }


    public String getClassManage() {
        return classManage;
    }

    public void setClassManage(String classManage) {
        this.classManage = classManage;
    }

    @Override
    public void setData() {
        super.setData();

        System.out.print("Enter Class Teacher Manage : ");
        setClassManage(scan.nextLine());
    }
}

package com.company;

import java.util.Scanner;

public class Person {
    private String id;
    private String name;
    private String address;
    private String email;

    Scanner scan = new Scanner(System.in);

    public Person(String id, String name, String address, String email) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public Person() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void setData(){
        System.out.print("Enter ID: ");
        setId(scan.nextLine());

        System.out.print("Enter Name: ");
        setName(scan.nextLine());

        System.out.print("Enter Email: ");
        setEmail(scan.nextLine());

        System.out.print("Enter Address: ");
        setAddress(scan.nextLine());
    }
}

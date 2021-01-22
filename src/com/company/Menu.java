package com.company;

import java.util.Scanner;

public class Menu {

    private Scanner scan = new Scanner(System.in);


    int mainMenu() {
        int menuNumber = 0;
        do {
            System.out.println("--------Please Choose Menu ---------");
            System.out.println("1. Add more data");
            System.out.println("2. Show data ");
            System.out.println("3. Exit");
            System.out.print("Please enter number:  ");
            try{
                menuNumber = scan.nextInt();
            }catch (Exception e){
                System.out.println("Please input number only");
            }
        } while (!(menuNumber > 0 && menuNumber < 4));
        return menuNumber;
    }


    int dataMenu(){
        int menuNumber = 0 ;

        do {
            System.out.println("--------Please Choose Menu ---------");
            System.out.println("1. Student");
            System.out.println("2. Teacher ");
            System.out.println("3. Exit");
            System.out.print("Please enter number:  ");
            try{
                menuNumber = scan.nextInt();
            }catch (Exception e){
                System.out.println("Please input number only");
            }
        }while (!(menuNumber > 0 && menuNumber < 4));
        return menuNumber;
    }



    boolean addMoreOrNot(String question) {
        String addMore = "";
        System.out.println(question);
        System.out.print("Press key yes / no :");
        addMore = scan.next();

        switch (addMore) {
            case "yes":
            case "y":
            case "Yes":
            case "Y": {
                return true;
            }
            case "No":
            case "n":
            case "no":
            case "N": {
                return false;
            }
            default:
                return false;
        }
    }




}

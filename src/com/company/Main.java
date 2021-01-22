package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        boolean application = true;
        Menu menuList = new Menu();
        Data data = new Data();
        do {
            int menu = menuList.mainMenu();
            switch (menu){
                case 1:
                    data.add();
                    break;
                case 2:
                    data.show();
                    break;
                case 3:
                    application = false;
                    break;
                default:
                    break;
            }
        }while (application);
    }









}



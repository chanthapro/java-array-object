package com.company;

import com.jakewharton.fliptables.FlipTableConverters;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Data {
    List<Student> studentList = new ArrayList<>();
    List<Teacher> teacherList = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    Menu menu = new Menu();

    void add() {
        boolean run = true;

        do {
            int dataMenu = menu.dataMenu();
            switch (dataMenu) {
                case 1:
                    Student student = new Student();
                    student.setData();
                    studentList.add(student);
                    break;
                case 2:
                    Teacher teacher = new Teacher();
                    teacher.setData();
                    teacherList.add(teacher);
                    break;
                default:
                    break;
            }
            run = menu.addMoreOrNot("Do you want to add more element ?");
        } while (run);
    }

    void show() {
        boolean run = true;
        do {
            int dataMenu = menu.dataMenu();
            switch (dataMenu) {
                case 1:
                    {
                        String[] headers = {"ID","Name","Email", "Address","Grade","Score"};
                        Object[][] data = mapData(MapType.STUDENT,headers.length);
                        System.out.println(FlipTableConverters.fromObjects(headers,data));
                        break;
                    }
                case 2:
                    {
                        String[] headers = {"ID","Name","Email", "Address","Class Manage"};
                        Object[][] data = mapData(MapType.TEACHER,headers.length);
                        System.out.println(FlipTableConverters.fromObjects(headers,data));
                        break;
                    }
                default:
                    break;
            }
            run = menu.addMoreOrNot("Do you want to show more ?");
        } while (run);
    }


    Object[][] mapData(MapType mapType,int headersLength){
        switch (mapType){
            case STUDENT:
            {
                Object[][] data = new Object[studentList.size()][headersLength];
                for(int i = 0 ; i < studentList.size() ; i ++ ){
                    Student student = studentList.get(i);
                    data[i][0] = student.getId();
                    data[i][1] = student.getName();
                    data[i][2] = student.getEmail();
                    data[i][3] = student.getAddress();
                    data[i][4] = student.getGrade();
                    data[i][5] = student.getScore();
                }
                return data;
            }
            case TEACHER:
            {
                Object[][] data = new Object[teacherList.size()][headersLength];
                for(int i = 0 ; i < teacherList.size() ; i ++ ){
                    Teacher teacher = teacherList.get(i);
                    data[i][0] = teacher.getId();
                    data[i][1] = teacher.getName();
                    data[i][2] = teacher.getEmail();
                    data[i][3] = teacher.getAddress();
                    data[i][4] = teacher.getClassManage();
                }
                return data;
            }
            default:
                return new Object[0][0];
        }
    }

}
enum MapType {
    STUDENT,
    TEACHER
}

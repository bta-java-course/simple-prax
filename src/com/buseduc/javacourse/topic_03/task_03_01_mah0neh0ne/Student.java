package com.buseduc.javacourse.topic_03.task_03_01_mah0neh0ne;

import java.util.ArrayList;
import java.util.Date;

public class Student {

    int id = 0;             //0 id
    String name = "Jon";      //1 Имя
    String surname = "Dou";    //2 Фамилия
    String pat = "Ryu";         //3 Отчество
    Date age= new Date(100,0,0);    //4 Дата  рождения
    String adres;               //5 Адрес
    int telnum;              //6 Телефон
    String fakultet;            //7 Факультет
    int numkurs;             //8 Курс
    int group;               //9 Группа

    public void setStudentAllValue(int id, String name, String surname, String pat, Date age, String adres,
                                   int telnum, String fakultet, int numkurs, int group) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.pat = pat;
        this.age = age;
        this.adres = adres;
        this.telnum = telnum;
        this.fakultet = fakultet;
        this.group = group;
    }

    public static void printLnStudentAllValue(Student Man) {
        System.out.print(Man.id + "  " + Man.name + " " + Man.surname + " " + Man.pat + " " + Man.age + " ");
        System.out.print(Man.adres + " " + Man.telnum + " ");
        System.out.println(Man.fakultet + " " + Man.numkurs + " " + Man.group);
    }

    public static void printMyFakultet(String fakultet1, Student Man) {
        if (fakultet1.equals(Man.fakultet)) {
            printLnStudentAllValue(Man);
        }
    }

    public static void printMyFakultetKurs(String fakultet1, String numkurs1, Student Man) {
        if ((fakultet1.equals(Man.fakultet))
                && (numkurs1.equals(Man.numkurs))) {
            printLnStudentAllValue(Man);
        }
    }

    public static void printMyGroup(String group1, Student Man) {
        if (group1.equals(Man.group)) {
            printLnStudentAllValue(Man);
        }
    }

    public static void printBirthdayAfte(Date sameDate, Student Man) {
        Date k = Man.age;
        if (sameDate.getTime() < k.getTime()) {
            printLnStudentAllValue(Man);
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student Ivan0 = new Student();
        Ivan0.setStudentAllValue(388092708,"Mihail","Sokolov","Dmotrievich",new Date(21,05,19),"Moskva",56267781,"Faculty of Business Management",2,1);
        list.add(Ivan0);
        Student Ivan1 = new Student();
        Ivan1.setStudentAllValue(299328932, "Kostja", "Mihulin", "Ivanovich", new Date(20, 11, 27), "Sankt-Peterburg", 445116, "Faculty of Design", 1, 2);
        list.add(Ivan1);
        Student Ivan2 = new Student();
        Ivan2.setStudentAllValue(388009900, "Sanek", "Kot", "Dmitrievich", new Date(22, 9, 28), "Ivanovo", 5672344, "Faculty of Environmental Protection", 3, 1);
        list.add(Ivan2);
        Student Ivan3 = new Student();
        Ivan3.setStudentAllValue(388900923, "Pasha", "Kokorin", "Vladimirovich", new Date(24, 05, 10), "Krasnodar", 56879924, "Faculty of International Relations", 3, 3);
        list.add(Ivan3);
        Student Ivan4 = new Student();
        Ivan4.setStudentAllValue(211873822, "Tanja", "Tarasova", "Nikolaevna", new Date(23, 9, 19), "Novgorod", 56321141, "Faculty of Translation", 2, 1);
        list.add(Ivan4);
        for (Student elem : list) {
            printMyFakultet("Faculty of Business Management", elem);
            printMyFakultet("Faculty of Design", elem);
            printMyFakultet("Faculty of Environmental Protection", elem);
            printMyFakultet("Faculty of International Relations", elem);
            printMyFakultet("Faculty of Translation", elem);
        }
    }
    }


















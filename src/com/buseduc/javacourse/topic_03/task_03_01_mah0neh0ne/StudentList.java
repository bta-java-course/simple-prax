package com.buseduc.javacourse.topic_03.task_03_01_mah0neh0ne;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mah0neh0ne
 * Тема 3. Классы и объекты
 * Задание 3_01. Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс, Группа. Создать массив объектов.
 * Вывести:
 * a) список студентов заданного факультета;
 * b) списки студентов для каждого факультета и курса;
 * c) список студентов, родившихся после заданного года;
 * d) список учебной группы.
 */

public class StudentList {
    private List<Student> studentsList= new ArrayList<>();
    public void addStudent(Student a){
        studentsList.add(a);
    }
    public void facultyPrint(String faculty){
        System.out.println("Список студентов факультета "+faculty);
        for(Student st:studentsList){
            if(st.getFaculty().equals(faculty)){
                System.out.println(st.toString());
            }
        }
    }
    public void groupPrint(String group){
        System.out.println("Список студентов группы "+group);
        for(Student st:studentsList){
            if(st.getGroup().equals(group)){
                System.out.println(st.toString());
            }
        }
    }
    public void yearOfBirthPrint(String year){
        System.out.println("Список студентов, родившихся после "+year+" года");
        for(Student st:studentsList){
            if(parseYear(st.getDateOfBirth().substring(6))>parseYear(year)){
                System.out.println(st.toString());}
        }
    }
    public void yearOfBirthPrint(){
        System.out.println("Список студентов, независимо от года рождения");
        for(Student st:studentsList){
            System.out.println(st.toString());}
    }

    public void facultyCoursePrint(String faculty,String course){
        System.out.println("Список студентов факультета "+faculty+" курса "+course);
        for(Student st:studentsList){
            if(st.getFaculty().equals(faculty)&st.getCourse().equals(course)){
                System.out.println(st.toString());}
        }
    }
    public void facultyCoursePrint(String faculty) {
        System.out.println("Список студентов факультета " + faculty + "всех курсов ");
        for (Student st : studentsList) {
            if (st.getFaculty().equals(faculty)) {
                System.out.println(st.toString());
            }
        }
    }

    public void facultyCoursePrint(int course){
        System.out.println("Список студентов всех факультетов, курса "+course);
        for(Student st:studentsList){
            if(Integer.parseInt(st.getCourse())==course){
                System.out.println(st.toString());}
        }
    }
    public int parseYear(String years){
        return Integer.parseInt(years);
    }

}
    


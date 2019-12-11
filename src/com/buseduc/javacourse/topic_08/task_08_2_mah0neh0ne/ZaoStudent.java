package com.buseduc.javacourse.topic_08.task_08_2_mah0neh0ne;


    interface Abiturient{
        public String getName();
    }

    abstract class Student implements Abiturient{
        public String name = null;

    }

    class ZaoStudent extends Student{
        private boolean type;

        public ZaoStudent(String name, boolean type){
            this.name = name;
            this.type = true;
        }

        public boolean isZao(){
            return type;
        }

        public String getName(){
            return this.name;
        }
    }


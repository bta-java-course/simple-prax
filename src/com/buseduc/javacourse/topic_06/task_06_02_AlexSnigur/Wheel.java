package com.buseduc.javacourse.topic_06.task_06_02_AlexSnigur;

    public class Wheel {
        private int radius;

        //Создаёи колёса, ниже конструктор с радиусами для колёс:

        Wheel(){
            this.radius = 19;
        }

        Wheel(int radius){
            if(radius < 17 || radius > 25){
                throw new IllegalArgumentException("Размер колеса должен быть от 17 до 25 дюймов");
            } else
                this.radius = radius;
        }

        public int getRadius(){
            return this.radius;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Wheel)) return false;

            Wheel wheel = (Wheel) o;

            return wheel.radius == radius;
        }

        @Override
        public String toString() {
            return "Wheel{" + "radius=" + radius + '}';
        }
    }


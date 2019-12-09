package com.buseduc.javacourse.topic_06.task_06_02_AlexSnigur;


public class Car extends Vehicle {

   //Объявляем переменные:

    private boolean isMove = false;
    private int fillUp;
    private String model;
    private Wheel frontRight = new Wheel();
    private Wheel frontLeft = new Wheel();
    private Wheel rearRight = new Wheel();
    private Wheel rearLeft = new Wheel();

    //Создаём конструкторы, ниже переопределяем методы equals(), hashCode() и toString():

    Car(String model ) {
        this.model = model;

    }

    public void stop() {
        this.isMove = false;
        System.out.println("Автомобиль остановлен.");
    }

    @Override
    public void move() {
        this.isMove = true;
        System.out.println("Автомобиль едет.");
    }

    @Override
    public void fillUp(int liters) {
        if (!isMove) {
            this.fillUp = liters;
            System.out.println("Автомоболь заправлен на " + liters+ " литров.");
        } else {
            System.out.println("Остановите автомобиль марки: " + getModel() );
        }

    }
    public String getModel(){
        return this.model;
    }

    public void changeWheel(int radius) {
        if (this.isMove) {
            System.out.println("Нельзя менять колёса на ходу ");
        } else {
            this.frontRight = new Wheel(radius);
            this.frontLeft = new Wheel(radius);
            this.rearRight = new Wheel(radius);
            this.rearLeft = new Wheel(radius);
            System.out.println("Колёса успешно заменены на размер " + radius + " дюймов ");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (fillUp != car.fillUp) return false;
        if (!getModel().equals(car.getModel())) return false;
        if (!frontLeft.equals(car.frontLeft)) return false;
        if (!frontRight.equals(car.frontRight)) return false;
        if (!rearLeft.equals(car.rearLeft)) return false;
        return rearRight.equals(car.rearRight);
    }

    @Override
    public int hashCode() {
        int result = getModel().hashCode();
        result = result + fillUp;
        result = result + frontRight.hashCode();
        result = result + frontLeft.hashCode();
        result = result + rearRight.hashCode();
        result = result + rearLeft.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Car{" + "carName='" + getModel() + '\'' +
                ", fuel=" + fillUp +
                ", frontRight=" + this.frontRight.getRadius() +
                ", frontLeft=" + this.frontLeft.getRadius() +
                ", rearRight=" + this.rearRight.getRadius() +
                ", rearLeft=" + this.rearLeft.getRadius() +
                '}';
    }
}


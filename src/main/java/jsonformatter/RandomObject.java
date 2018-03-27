package jsonformatter;

import java.util.Date;

/**
 * Created by Mitet0 on 3/27/2018
 */
public class RandomObject {
    private String color;
    private int age;
    private Date date;
    private String car;

    public RandomObject(String car, String color, int age, Date date) {
        this.car = car;
        this.color = color;
        this.age = age;
        this.date = date;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Car{" +
                "car='" + car + '\'' +
                ", age=" + age +
                ", date=" + date +
                ", color='" + color + '\'' +
                '}';
    }
}

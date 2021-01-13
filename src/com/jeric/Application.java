package com.jeric;

public class Application {

    public static void main(String[] args) {

        MyObject object1 = new MyObject(222L);
        MyObject object2 = new MyObject(212L);

        if (object1.equals(object2)) {
            System.out.println("The are the same");
        } else {
            System.out.println("The are not the same");
        }

    }
}
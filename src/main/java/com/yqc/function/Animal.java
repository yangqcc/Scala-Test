package com.yqc.function;

/**
 * Created by yangqc on 2017/4/19.
 */
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void showName();


/*    public static void main(String[] args) {
        new Animal("dog") {
            @Override
            public void showName() {
                System.out.println(this.name);
            }
        }.showName();
    }*/
}

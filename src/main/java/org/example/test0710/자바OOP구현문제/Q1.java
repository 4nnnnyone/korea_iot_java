package org.example.test0710.자바OOP구현문제;

import java.util.ArrayList;

class Animal {
    String name;

    void makeSound() {
        System.out.println("동물 울음 소리");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("야옹");
    }
}

public class Q1 {
    public static void main(String[] args) {

        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Cat();

        for (Animal a : animals) {
            a.makeSound();
        }

    }
}

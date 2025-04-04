import java.util.*;

class Animal {
    private String name;
    private int age;

    Animal(String n, int a) {
        name = n;
        age = a;
    }

    public void makeSound() {
        System.out.println("Animal making sound...");
    }

    public void getName() {
        System.out.println("Name: " + name);
    }

    public void getAge() {
        System.out.println("Age: " + age);
    }
}

class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }
    @Override
    public void makeSound() {
        System.out.println("Dog barks....");
    }
}

class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }
    @Override
    public void makeSound() {
        System.out.println("Cat Meows....");
    }
}

class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }
    @Override
    public void makeSound() {
        System.out.println("Bird chrips....");
    }
} 

class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("lion", 10);
        animal.getName();
        animal.getAge();
        animal.makeSound();

        Dog dog = new Dog("dog", 3);
        dog.getName();
        dog.getAge();
        dog.makeSound();

        Cat cat = new Cat("cat", 2);
        cat.getName();
        cat.getAge();
        cat.makeSound();

        Bird bird = new Bird("bird", 6);
        bird.getName();
        bird.getAge();
        bird.makeSound();


    }
}
package week04.lesson1;

public class Person {
    private String name;
    public int age;

    // Constructor 1
    Person() {
        this.name = "no name";
        this.age = 1;
    }

    // Constructor 2
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
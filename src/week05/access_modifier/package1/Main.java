package week05.access_modifier.package1;

import week05.access_modifier.package2.Cat;

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println("Motto: " + d.motto);
//        System.out.println("Name: " + d.name); // Error because name in Animal is set to private
        System.out.println("Sound: " + d.sound);
        System.out.println("Color: " + d.color);

        Cat c = new Cat();
//        System.out.println("Motto: " + c.motto); // Error because motto in Animal is set to DEFAULT and Cat is in different package
//        System.out.println("Name: " + c.name); // Error because name in Animal is set to private
        System.out.println("Sound: " + c.sound);
        System.out.println("Color: " + c.color);
    }
}

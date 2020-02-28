package week05.access_modifier.package2;

import week05.access_modifier.package1.Animal;
import week05.access_modifier.package1.Dog;

public class Main {
    public static void main(String[] args) {

        Dog d = new Dog();
//        System.out.println("Motto: " + d.motto); // Error because motto in Animal is set to default and this Main class is inside different package than Animal
//        System.out.println("Name: " + d.name); // Error because name in Animal is set to private
//        System.out.println("Sound: " + d.sound); // Error because sound in Animal is set to protected
        System.out.println("Color: " + d.color);

        Cat c = new Cat();
//        System.out.println("Motto: " + c.motto); // Error because motto in Animal is set to default thus can not accessed from different package
//        System.out.println("Name: " + c.name); // Error because name in Animal is set to private thus cannot accessed from different class
//        System.out.println("Sound: " + c.sound); // Error because sound in Animal is set to protected
        System.out.println("Color: " + c.color);
    }
}

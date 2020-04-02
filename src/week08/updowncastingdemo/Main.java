package week08.updowncastingdemo;

public class Main {
    public static void main(String[] args) {
        // https://www.codejava.net/java-core/the-java-language/what-is-upcasting-and-downcasting-in-java
        // Upcasting Example
        Dog dog = new Dog();
        Animal anim = (Animal) dog; // Upcasting dog to Animal
        anim.eat();

        // Other Upcasting Example
        Mammal mammal = new Cat();
        Animal anim2 = new Dog();

        // Another Upcasting Example
        Cat cat = new Cat();
        AnimalTrainer trainer = new AnimalTrainer();
        trainer.teach(dog);
        trainer.teach(cat);

        // Downcasting Example
        Animal anim3 = new Cat();
        Cat cat2 = (Cat) anim3;

        // Fail Downcasting Example
        Animal anim4 = new Cat();
        Dog dog2 = (Dog) anim4; // FAIL! -- This will throw a ClassCastException because the actual object type is Cat. And a Cat is not a Dog so we cannot cast it to a Dog.

        // Check before casting
        if(anim4 instanceof Cat){
            Cat cat3 = (Cat) anim4;
            cat3.meow();
        }else if(anim4 instanceof Dog){
            Dog dog3 = (Dog) anim4;
            dog3.bark();
        }
    }
}

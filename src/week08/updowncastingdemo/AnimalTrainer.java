package week08.updowncastingdemo;

public class AnimalTrainer {
    public void teach(Animal anim){
        anim.move();
        anim.eat();

        if(anim instanceof Dog){
            Dog dog = (Dog) anim; //down casting
            dog.bark();
        }
    }
}

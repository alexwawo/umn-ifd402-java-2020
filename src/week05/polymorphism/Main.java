package week05.polymorphism;

import static week05.polymorphism.Vegetarian.fav;

public class Main {
    public static void main(String[] args) {
        PoodleDeer d = new PoodleDeer();
        System.out.println("Motto: " + d.getMotto());
        System.out.println("Fav. Food: " + fav);
//        fav = "hehe";
    }
}

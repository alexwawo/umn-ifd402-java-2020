package week05.access_modifier.package2;
import week05.access_modifier.package1.Animal;

public class Cat extends Animal {
//    public String getMotto() {
////        return super.motto; // Error because motto in Animal is set to DEFAULT --> can not accessed outside the package
//        return "Something";
//    }
    public String getSound() {
        return super.sound;
    }
}

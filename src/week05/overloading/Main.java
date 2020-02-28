package week05.overloading;

public class Main {
    public static void main(String[] args) {
        MyClass t = new MyClass(0);
        t.info();
        t.info("Overloaded method");

        //Overloaded constructor
        new MyClass();
    }
}

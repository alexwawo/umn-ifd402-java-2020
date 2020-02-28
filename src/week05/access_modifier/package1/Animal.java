package week05.access_modifier.package1;

public class Animal {
    String motto = "Life is Beautiful";
    private String name = "Bruno";
    protected String sound = "Roar...";
    public String color = "Black";

    void sayWow() {
        System.out.println("Wow from Animal");
    }
    private void sayHello() {
        System.out.println("Hello from Animal");
    }
    protected void sayHi() {
        System.out.println("Hi from Animal");
    }
    public void sayHaha() {
        System.out.println("Haha from Animal");
    }
}

package week04.lesson1;

public class Human {
    private String hair_color, eye_color, name, gender;
    private static int age;
    private int weight;
    public int height;
    private int lifespan;
    public static int current_year = 2020;

    Human(int weight, int height) {
        this.height = height;
        this.weight = weight;
        this.age = 0;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void birthday() {
        addAge();
    }

    private static void addAge() {
        age++;
    }
}

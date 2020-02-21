package week04.lesson1;

public class Human {
    String hair_color, eye_color, name, gender;
    int age, weight, height;

    Human(int weight, int height) {
        this.height = height;
        this.weight = weight;
        this.age = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void birthday() {
        this.age++;
    }
}

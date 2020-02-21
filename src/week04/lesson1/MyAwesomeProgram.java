package week04.lesson1;

public class MyAwesomeProgram {
    public static void main(String[] args) {
        Human john = new Human(3, 50);
        john.setName("John Doe");

        Human jane = new Human(2, 40);
        jane.setName("Jane Doe");

        System.out.println(john.current_year);
        System.out.println(jane.current_year);
        System.out.println(Human.current_year);

        john.current_year = 2025;

        System.out.println(john.current_year);
        System.out.println(jane.current_year);
        System.out.println(Human.current_year);
    }
}

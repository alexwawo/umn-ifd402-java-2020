package week09;

public class TestThrow {
    static void validate(int age){
        if(age < 18)
            throw new ArithmeticException("not valid");
        else
            System.out.println("welcome to vote");
    }

    public static void main(String[] args){
        try {
            validate(13);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("normal flow...");
    }
}

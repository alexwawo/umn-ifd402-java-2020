package week09;

public class TestTryCatch1 {
    public static void main(String[] args){
//        int data = 50/0;
        try{
            int data = 50/0;
        }catch(ArithmeticException e){
            System.out.println("bagian program yang dijalankan ketika terjadi error..");
            System.out.println(e);
        }
        System.out.println("rest of code...");
    }
}

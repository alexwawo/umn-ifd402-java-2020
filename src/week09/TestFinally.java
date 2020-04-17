package week09;

public class TestFinally {
    public static void main(String args[]){
        try{
            int data=25/5;
            System.out.println(data);
            System.out.println("inside try");
        }
        catch(ArithmeticException e){System.out.println(e);}
        finally{System.out.println("finally block is always executed");}
        System.out.println("rest of the code...");
    }
}

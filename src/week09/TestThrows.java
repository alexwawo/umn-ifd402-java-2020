package week09;

import java.io.IOException;

public class TestThrows {
    void m() throws IOException {
        System.out.println("hello from m()");
        throw new IOException("device error");
    }
    void n() throws IOException {
        System.out.println("hello from n()");
        m();
        System.out.println("hello from n() after m()");
    }
    void p() {
        try {
            n();
        } catch(Exception e) {
            System.out.println("exception handled");
        }
    }
    public static void main(String[] args){
        TestThrows obj = new TestThrows();
        obj.p();
        System.out.println("normal flow...");
    }
}

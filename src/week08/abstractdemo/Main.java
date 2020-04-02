package week08.abstractdemo;

public class Main {
    public static void main(String[] args) {
        Child data = new Child();
        String code = "E-001";
        String name = "John Thor";

        data.judul();
        data.setData(code, name);
        System.out.println();
    }
}

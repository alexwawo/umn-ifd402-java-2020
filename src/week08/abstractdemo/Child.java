package week08.abstractdemo;

public class Child extends Basic{
    public void setData(String code, String name) {
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
    }

    @Override
    public void hehe() {

    }

}

package week05.inheritance;

public class Staff {
    private String name;
    private String code;

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void drawLine() {
        System.out.println("--------------------------------");
    }
}

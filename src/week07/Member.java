package week07;

public class Member {
    private String name, email, phone;
    Member(String name, String email, String phone){
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getMemberInfo(){
        return this.name + " (e: " + this.email + " p: " + this.phone + ")";
    }
}

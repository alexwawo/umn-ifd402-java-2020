package week07;

public class User {
    private String name, role, username, password;

    User(String name, String username, String password){
        this.name = name;
        this.role = "staff";
        this.username = username;
        this.password = password;
    }

    public User() {

    }

    public Boolean login(String username, String password) {
        if(this.username.equals(username) && this.password.equals(password)){
            return true;
        }else{
            return false;
        }
    }

    public void setAsHead() {
        this.role = "head";
    }

    public String getName(){
        return this.name;
    }

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }

    public String getRole(){
        return this.role;
    }


}

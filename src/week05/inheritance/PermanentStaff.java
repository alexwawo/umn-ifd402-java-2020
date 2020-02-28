package week05.inheritance;

public class PermanentStaff extends Staff {
    String jobTitle;

    public String getJobTitle() {
        return jobTitle;
    }
    public void setJabatan(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public void print() {
        System.out.println("Permanent Staff Data");
    }
}

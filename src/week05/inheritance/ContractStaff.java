package week05.inheritance;

public class ContractStaff extends Staff {
    int workHours;

    public int getWorkHours() {
        return workHours;
    }
    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }
    public void print() {
        System.out.println("Contract Staff Data");
    }
}

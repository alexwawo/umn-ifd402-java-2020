package week05.inheritance;

public class Main {
    public static void main(String[] args) {
        PermanentStaff a = new PermanentStaff();
        ContractStaff b = new ContractStaff();

        a.setCode("PS-001");
        a.setName("Brino");
        a.setJabatan("Manager");
        a.print();
        a.drawLine();

        System.out.println("Kode \t\t: " + a.getCode());
        System.out.println("Name \t\t: " + a.getName());
        System.out.println("Job Title \t: " + a.getJobTitle());

        System.out.println();
        b.setCode("CS-001");
        b.setName("Blessy");
        b.setWorkHours(20);
        b.print();
        b.drawLine();

        System.out.println("Code \t\t: " + b.getCode());
        System.out.println("Name \t\t: " + b.getName());
        System.out.println("Work Hours \t: " + b.getWorkHours());
    }
}

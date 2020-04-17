package week09;

public class DemoKelas {

    public int bagi(int a, int b) throws Exception {
        return a/b;
    }

    public void salah(){
        throw new ArrayIndexOutOfBoundsException("Pokoknya salah");
    }

    public static void main(String[] args) {
        DemoKelas x = new DemoKelas();
//        System.out.println(x.bagi(4, 0));

    }
}

public class Lecture16_CipherSchools {
    private int a = 5;
    private int b = 10;
    private int c = 15;
    private int d = 20;

    public int getA() {
        System.out.println("Val");
        return this.a;
    }

    public int getB() {
        return this.b;
    }

    public void setA(int a) {
        if (a > 100) {
            this.a = a;
            System.out.println("Value of A changed to: " + a);
        } else {
            System.out.println("Cannot set - value outside");
        }
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public static void main(String[] args) {
        Lecture16_CipherSchools d = new Lecture16_CipherSchools();
        System.out.println(d.getA());
        d.setA(100);
        System.out.println(d.getA());
    }
}

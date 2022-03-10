package tamrin_manzel_2;

public class Delta {

    private int A;
    private int B;
    private int C;

    public Delta(int a, int b, int c) {
        A = a;
        B = b;
        C = c;
    }

    public int getA() { return A; }

    public void setA(int a) { A = a; }

    public int getB() { return B; }

    public void setB(int b) { B = b; }

    public int getC() { return C; }

    public void setC(int c) { C = c; }

    public int calculate_delta(){

        int result = (B * B) - (4 * A * C);
        return result;
    }
}

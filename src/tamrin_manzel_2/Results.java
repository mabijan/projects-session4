package tamrin_manzel_2;

public class Results {

    int Delta;
    private int A;
    private int B;
    private int C;

    public Results(int delta, int a, int b, int c) {
        Delta = delta;
        A = a;
        B = b;
        C = c;
    }

    public double getDelta() { return Delta; }

    public void setDelta(int Delta) { this.Delta = Delta; }

    public int getA() { return A; }

    public void setA(int a) { A = a; }

    public int getB() { return B; }

    public void setB(int b) { B = b; }

    public int getC() { return C; }

    public void setC(int c) { C = c; }

    public void get_result() throws Exception_Delta{

            if (Delta > 0) {

                double result1 = ((-1 * B) + Math.sqrt(Delta)) / (2 * A);
                double result2 = (((-1 * B) - (Math.sqrt(Delta))) / (2 * A));

                System.out.println("Delta > 0");
                System.out.format("The results for this equation are: %f, %f", result1, result2);
            } else if (Delta == 0) {

                float result1 = ((-B) / (2 * A));

                System.out.println("Delta == 0");
                System.out.format("The results for this equation are: %f", result1);
            }
            if (Delta < 0) {
                throw new Exception_Delta("Delta < 0!\nThis equation doesnt have real answer(s)!");
            }

    }
}



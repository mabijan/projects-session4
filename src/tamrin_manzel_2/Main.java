package tamrin_manzel_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception_Delta{


        Scanner input = new Scanner(System.in);

        System.out.print("enter a value for a:");
        int A = input.nextInt();

        System.out.print("enter a value for b:");
        int B = input.nextInt();

        System.out.print("enter a value for c:");
        int C = input.nextInt();

        var object_test1 = new Delta(A, B, C);
        int Delta = object_test1.calculate_delta();


        var object_test2 = new Results(Delta, A, B, C);
        object_test2.get_result();

    }
}

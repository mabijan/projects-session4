package kar_kelasi;

import java.util.Scanner;

public class Getter {

     private String[] person1 = new String[3];
     private String[] person2 = new String[3];


    public void get_info() {

    Scanner input = new Scanner(System.in);

        System.out.println("==========PERSON1==========");

        System.out.print("please enter your name:");
        person1[0] = input.next();

        System.out.print("please enter your family:");
        person1[1] = input.next();

        System.out.print("please enter your age:");
        person1[2] = input.next();

        System.out.println("==========PERSON2==========");

        System.out.print("please enter your name:");
        person2[0] = input.next();

        System.out.print("please enter your family:");
        person2[1] = input.next();

        System.out.print("please enter your age:");
        person2[2] = input.next();

    }

    public void print_info() {

        System.out.println("==========PERSON1==========");

        for (int i = 0; i <= 2; i++)
            System.out.println(person1[i]);

        System.out.println("==========PERSON2==========");

        for (int i = 0; i <= 2; i++)
            System.out.println(person2[i]);

    }

    public void compare() throws Similar_Exception {

        System.out.println("==========result=========");

        if (
        person1[0].contains(person2[0]) &&

        person1[1].contains(person2[1]) &&

        person1[2].contains(person2[2]))

            throw new Similar_Exception("These two have similar id(s)!");

        else

            System.out.println("They are not similar!");
    }
}

package tamrin_manzel_1;

import java.util.Scanner;

public class Compare_Password {

    private String PASSWORD;

    public Compare_Password(String PASSWORD) { this.PASSWORD = PASSWORD; }

    public String getPASSWORD() { return PASSWORD; }

    public void setPASSWORD(String PASSWORD) { this.PASSWORD = PASSWORD; }

    Scanner input = new Scanner(System.in);

    String USER_PASSWORD = input.next();

    public boolean compare(){
        return PASSWORD.equals(USER_PASSWORD);
    }
}

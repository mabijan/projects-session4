package tamrin_manzel_1;

import java.util.Scanner;

public class Compare_Username {

    private String USERNAME;

    public Compare_Username(String USERNAME) { this.USERNAME = USERNAME; }

    public String getUSERNAME() { return USERNAME; }

    public void setUSERNAME(String USERNAME) { this.USERNAME = USERNAME; }

    Scanner input = new Scanner(System.in);

    String USER_USERNAME = input.next();

    public boolean compare(){
        return USERNAME.equals(USER_USERNAME);
    }
}

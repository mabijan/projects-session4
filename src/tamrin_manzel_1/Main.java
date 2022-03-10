package tamrin_manzel_1;

public class Main {

    public static void main(String[] args) throws Exception_Invalid_Userpass {

        System.out.print("please insert your username1:");
        var object_username1 = new Get_Username();
        String USERNAME = object_username1.return_username();

        System.out.print("please insert your username2:");
        var object_compare1 = new Compare_Username(USERNAME);
        boolean KEY1 = object_compare1.compare();

        System.out.print("please insert your password1:");
        var object_get = new Get_Password();
        String PASSWORD = object_get.return_pass();

        System.out.print("please insert your password2:");
        var object_compare2 = new Compare_Password(PASSWORD);
        boolean KEY2 = object_compare2.compare();

      if (KEY1 && KEY2)
          System.out.println("access granted");
      else if (!(KEY1 && KEY2))
          throw new Exception_Invalid_Userpass("Your user or pass is invalid.\naccess denied!");

    }
}

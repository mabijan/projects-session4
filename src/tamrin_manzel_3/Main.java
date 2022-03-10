package tamrin_manzel_3;

public class Main {

    public static void main(String[] args) throws Exception_Invalid_Stringtype{

        System.out.print("please insert a string:");

        var object_test1 = new Getter();
        String str = object_test1.return_str();

        System.out.format("Your chosen string is:%s\n", str);

        var object_test2 = new Search(str);
        object_test2.search();
    }
}

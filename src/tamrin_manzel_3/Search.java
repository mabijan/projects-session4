package tamrin_manzel_3;

public class Search {

    String str;
    Boolean[] result;
    int sw1 = 0;
    int sw2 = 0;

    public Search(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void search() throws Exception_Invalid_Stringtype {

        for (int i = 0; i < 10; i++) {

            if (str.contains(String.valueOf(i)))
                sw1 = 1;
        }

        if (sw1 == 1)

            throw new Exception_Invalid_Stringtype("""
                    Error!
                    Invalid string type!
                    Your string contains number value(s)
                    """
            );

        else if (sw1 == 0)
            System.out.format("your string length is:%d", str.length());

    }
}

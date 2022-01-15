import java.lang.reflect.Array;
import java.util.ArrayList;

public class Program7 {
    public static void  main(String[] args) throws Exception {

        // exmaple for enhance for loop for integer
        int array []= {12,44,66,78,90,68,74,555};

        for (int number:array
             ) {
            System.out.println(number);
        }

        // example for enhance for loop in string
        ArrayList<String> stringsExample = new ArrayList<String >();
        stringsExample.add("kazi");
        stringsExample.add("sharif");
        stringsExample.add("rimu");

        for (String list:stringsExample
             ) {
            System.out.println(list);
        }



    }
}

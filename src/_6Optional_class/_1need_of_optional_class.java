package _6Optional_class;

import java.util.Optional;

/**
 ---It is a public final class and
 used to deal with NullPointerException in Java application

 --- It provides methods which are used to check the presence
 of value for particular variable.
 **/
public class _1need_of_optional_class {
    public static void main(String args[]){

        //without optional class -- will throw runtime exception when we try to access null string
        /**
        String[] s1 = new String[10];
        String lowercaseString = s1[5].toLowerCase();
        System.out.print(lowercaseString);
        **/

        //with using optional class
        String[] s2 = new String[10];
        Optional<String> checkNull = Optional.ofNullable(s2[5]);

        if(checkNull.isPresent()){  // check for value is present or not
            String lowercaseString = s2[5].toLowerCase();
            System.out.print(lowercaseString);
        }else
            System.out.println("string value is not present");
    }
}

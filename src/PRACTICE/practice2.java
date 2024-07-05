//package PRACTICE;
//
//import java.util.ArrayList;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class practice2 {
//    public static void main(String args[]){
//
//        ArrayList<Integer> a1 = new ArrayList<>();
//        a1.add(1);
//        a1.add(2);
//        a1.add(3);
//        a1.add(4);
//        a1.add(5);
//
//        a1.stream().filter((x) -> x%2 ==0).
//                peek((x) -> System.out.println(x)).collect(Collectors.toList());
//
//    }
//}




//package PRACTICE;
//
//import java.util.ArrayList;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class practice2 {
//    public static void main(String args[]){
//
//        ArrayList<Integer> a1 = new ArrayList<>();
//        a1.add(15);
//        a1.add(25);
//        a1.add(16);
//        a1.add(40);
//        a1.add(112);
//
//        a1.stream().filter(x -> x.toString().charAt(0) == '1').
//                peek(x ->  System.out.println(x)).collect(Collectors.toList());
//
//
//    }
//}





//package PRACTICE;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Optional;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class practice2 {
//    public static void main(String args[]){
//
//        ArrayList<Integer> a1 = new ArrayList<>();
//        a1.add(15);
//        a1.add(25);
//        a1.add(16);
//        a1.add(40);
//        a1.add(112);
//        a1.add(15);
//
//        Optional<Integer> o =  a1.stream().filter(x -> Collections.frequency(a1,x) > 1).findFirst();
//        System.out.println(o);
//
//    }
//}








//package PRACTICE;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Optional;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class practice2 {
//    public static void main(String args[]){
//
//        ArrayList<Integer> a1 = new ArrayList<>();
//        a1.add(15);
//        a1.add(25);
//        a1.add(16);
//        a1.add(40);
//        a1.add(112);
//        a1.add(15);
//
//
//        System.out.println( a1.stream().findFirst());
//
//    }
//}
















//package PRACTICE;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Optional;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class practice2 {
//    public static void main(String args[]){
//
//        ArrayList<Integer> a1 = new ArrayList<>();
//        a1.add(15);
//        a1.add(25);
//        a1.add(16);
//        a1.add(40);
//        a1.add(112);
//        a1.add(15);
//
//
//        System.out.println( a1.stream().count());
//
//    }
//}

















//package PRACTICE;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Optional;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class practice2 {
//    public static void main(String args[]){
//
//        ArrayList<Integer> a1 = new ArrayList<>();
//        a1.add(15);
//        a1.add(25);
//        a1.add(16);
//        a1.add(40);
//        a1.add(112);
//        a1.add(15);
//
//
//        System.out.println( a1.stream().max((x,y) -> x.compareTo(y)));
//
//    }
//}




//package PRACTICE;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Optional;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class practice2 {
//    public static void main(String args[]){
//
//        ArrayList<String> a1 = new ArrayList<>();
//        a1.add("apple");
//        a1.add("orange");
//        a1.add("mango");
//        a1.add("pineapple");
//        a1.add("muskmelon");
//        a1.add("watermelon");
//
//        a1.stream().sorted().forEach(System.out::println);
//    }
//}



//package PRACTICE;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.Optional;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class practice2 {
//    public static void main(String args[]){
//
//        ArrayList<String> a1 = new ArrayList<>();
//        a1.add("apple");
//        a1.add("orange");
//        a1.add("mango");
//        a1.add("pineapple");
//        a1.add("muskmelon");
//        a1.add("watermelon");
//
//        a1.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
//    }
//}

//package PRACTICE;
//
//import java.util.*;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class practice2 {
//    public static void main(String args[]){
//
//        ArrayList<String> a1 = new ArrayList<>();
//        a1.add("pear");
//        a1.add("mango");
//        a1.add("apple");
//        a1.add("grapes");
//        a1.add("pear");
//        a1.add("mango");
//
//        Optional<String> o = a1.stream().filter(x -> Collections.frequency(a1,x) <=1).findFirst();
//
//        System.out.println(o);
//
//
//    }
//}
//









package PRACTICE;

//import java.util.*;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class practice2 {
//    public static void main(String args[]){
//
//        ArrayList<String> a1 = new ArrayList<>();
//        a1.add("pear");
//        a1.add("mango");
//        a1.add("apple");
//        a1.add("grapes");
//        a1.add("pear");
//        a1.add("mango");
//
//        Optional<String> o = a1.stream().filter(x -> Collections.frequency(a1,x) >1).findFirst();
//
//        System.out.println(o);
//
//
//    }
//}











import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


interface a{
   public void a();
}

interface b extends a{

}

class c{

}




public class practice2 {
    public static void main(String args[]){

        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);
        a1.add(50);

        //forEach loop
        for(Integer a: a1)
        {
            if(a == 20)
            {
                System.out.println(a);
            }
        }

        //forEach method
        a1.forEach((Integer a) -> {
                    if (a == 20) {
                        System.out.println(a);
                    }
               });

        //forEach method using method reference
        a1.forEach(System.out::println); //object_name::method_name

    }
}

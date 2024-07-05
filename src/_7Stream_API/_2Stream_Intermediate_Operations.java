package _7Stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/** stream -- it iterates internally **/

public class _2Stream_Intermediate_Operations {
    public static void main(String args[]){
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);
        a1.add(30);
        a1.add(50);


        //converting ArrayList to Stream
        /**
        Stream s = a1.stream();  //or   a1.stream();
        s.forEach(x -> System.out.println(x));
        **/




        //-----------Intermediate Operations------------
        //distinct -- returns unique elements
        /**
        a1.stream().distinct().forEach(System.out::println);
         **/


        //sorted -- sorted according to natural order
        /**
        Stream.of("neethi","guhan","mani").sorted().forEach(System.out::println);
        **/


        //or we can do the above like this
        /**
        a1.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);
        **/


        //map  -- returns a stream consisting of results after applying given function to elements of stream
        /**
        Stream.of(10,20,30,40).map(t -> t+5).forEach(System.out::println);
         **/

        /**
        Stream.of("one","two","three","four").filter(x -> x.length() > 3)
                .peek(x -> System.out.println("Filtered value "+x))
                .map(x -> x.toUpperCase())
                .peek(x -> System.out.println("Mapped value " +x)).collect(Collectors.toList());
         **/

        //peek vs map
        //map -- change the original value
        //peek -- will not change the original value
        /**
        ArrayList<String> a2 = new ArrayList<>();
        a2.add("A");
        a2.add("B");

        List<String > l1 = a2.stream().map(x -> x.toLowerCase()).collect(Collectors.toList());
        System.out.println(l1);

        List<String > l2 = a2.stream().peek(x -> x.toLowerCase()).collect(Collectors.toList());
        System.out.println(l2);
        **/


        /**
        //limit  -- returns a stream containing first n elements

        Stream<Integer> s1 = a1.stream();
        List<Integer> l1 = s1.limit(3).collect(Collectors.toList());
        l1.forEach(System.out::println);

        //skip  -- returns a stream after skipping first n elements

        Stream<Integer> s2 = a1.stream();
        List<Integer> l2 = s2.skip(2).collect(Collectors.toList());
        l2.forEach(System.out::println);


         **/



         }
}

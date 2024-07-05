package _7Stream_API;

import java.util.ArrayList;
import java.util.Optional;

public class _3Stream_Terminal_Operations {
    public static void main(String args[]){

        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);
        a1.add(30);
        a1.add(50);


        //Terminal operations


        //forEach & forEachOrder
        /**
         a1.forEach(x -> System.out.println(x));
         a1.stream().forEach(x -> System.out.println(x));
         a1.stream().forEachOrdered(x -> System.out.println(x));
         **/

        //in parallelStream forEach will not iterate in order
        //in parallelStream forEachOrdered will  iterate in order

        /**
         a1.parallelStream().forEach(x -> System.out.println(x));
         a1.parallelStream().forEachOrdered(x -> System.out.println(x));
         **/


        //concat() -- used to concat to streams

        /**
        Stream<String> s1 = Stream.of("java","programming language");
        Stream<String> s2 = Stream.of("sql","query language");

        Stream.concat(s1,s2).forEach(System.out::println);
        **/


        //findFirst,findAny
//        Optional<Integer> o = a1.stream().findFirst();
//        Optional<Integer> o = a1.stream().findAny();
        /**
        Optional<Integer> o = a1.parallelStream().findAny();


        if(o.isPresent())
        {
            System.out.println(o.get());
        }
        else
        {
            System.out.println("there is no values");
        }
        **/

        //toArray
        /**
        Object[] o = a1.stream().toArray();
        System.out.println(Arrays.toString(o));
        **/


        //collect -- used to collect the values and store
        /**
        a1.stream().collect(Collectors.toList()).forEach(System.out::println);
        **/

        //terminal operation --  collect(Collectors.toList()) -- used to collect the elements an store
        /**
         List<Integer> l1 = a1.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
         System.out.println(l1);
         **/


        //count
        /**
        System.out.println(a1.stream().count());
        **/

        /**

        //max
        System.out.println(a1.stream().max((i,j) -> i.compareTo(j)));

        //return type of max is Optional
        Optional<Integer> op1 = a1.stream().max((i,j) -> i.compareTo(j));
        System.out.println(op1);

        //using comparator
        Optional<Integer> op2 = a1.stream().max(Comparator.reverseOrder());
        System.out.println(op2);


        //min
        System.out.println(a1.stream().min((i,j) -> i.compareTo(j)));

        //return type of min is Optional
        Optional<Integer> op3 = a1.stream().min((i,j) -> i.compareTo(j));
        System.out.println(op3);

        **/

        //anyMatch, noneMatch, allMatch

        /**
        System.out.println(a1.stream().anyMatch(x -> x == 40));
        System.out.println(a1.stream().allMatch(x -> x == 30));
        System.out.println(a1.stream().noneMatch(x -> x == 100));
         **/

        //reduce - example1
        System.out.println(a1.stream().reduce(0, (x,y) -> (x+y)));

        ArrayList<String> a2 = new ArrayList<>();
        a2.add("guhanprasath");
        a2.add("neethi");
        a2.add("mani");

        //reduce - example2

        Optional<String> o1 = a2.stream().reduce((x,y) -> x.length()>y.length() ? x : y);
        System.out.println(o1);



    }
}

package _9Hash_Map;

import java.util.HashMap;

public class _1Hash_Map_methods_related_to_java8 {
    public static void main(String args[]){
        HashMap<Integer,String> h1 = new HashMap();
        h1.put(1,"Hyundai");
        h1.put(2,"tiago");
        h1.put(3,"shift");
        h1.put(4,"triumph");

        System.out.println(h1 );

        //compute
        h1.compute(2,(key,val) -> val.concat(" car"));
        System.out.println(h1);

        //computeIfPresent
        h1.computeIfPresent(3,(key,val) -> val + 2);
        System.out.println(h1);

        //computeIfAbsent
        h1.computeIfAbsent(5, val -> "tigor");
        System.out.println(h1);


        //merge -- merging to map
        HashMap<Integer,String> h2 = new HashMap();
        h2.put(1,"guhan");
        h2.put(2,"mani");
        h2.put(3,"neethi");
        h2.put(4,"prasath");

        h1.forEach((key,value) -> h2.merge(key,value,(v1,v2)
        -> v1.equalsIgnoreCase(v2) ? v1 : v2 + ", "+v1));

        System.out.println(h2);

    }
}

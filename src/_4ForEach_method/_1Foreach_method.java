package _4ForEach_method;

import java.util.ArrayList;

public class _1Foreach_method {
    public static void main(String args[]){
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);
        a1.add(50);

        //forLoop
        for(int i=0; i<a1.size(); i++)
        {
            System.out.println(a1.get(i));
        }


        //forEach loop
        for(Integer a: a1)
        {
            System.out.println(a);
        }

        //forEach method -- inside foreach method we passing the object of consumer

        /** forEach method with lambda expression (object of consumer)**/

        a1.forEach((Integer a) -> System.out.println(a));  //elements in a1 will store in a one by one

        //forEach method using method reference
        a1.forEach(System.out::println); //object_name::method_name
    }
}

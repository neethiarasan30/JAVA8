package _5Built_in_Functional_Interface;

import java.util.Optional;
import java.util.function.Supplier;

/**
 Supplier<T> functional interface:


 --we cannot give inputs

 methods:
 get()
 **/
public class _4supplier_example1 {
    public static void main(String args[]){

        Supplier<Integer> s1 = () -> Math.max(50,60);
        System.out.println(s1.get());

    }
}

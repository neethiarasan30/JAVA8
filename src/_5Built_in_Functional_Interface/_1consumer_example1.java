package _5Built_in_Functional_Interface;

import java.util.function.Consumer;

/**
 Consumer<T> functional interface:

 it has void return type

 methods:
 accept();   --> abstract method
 andThen();
 **/


public class _1consumer_example1 {
        public static void main(String args[]){
            Consumer<Integer> c1 = (Integer n) -> System.out.println(n*2);

            Consumer<Integer> c2 = (Integer n) -> System.out.println(n+2);

            c1.accept(5);

            c1.andThen(c2).accept(5);        //or c1.accept(5)
            //c2.accept(5)
        }
    }





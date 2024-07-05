package _5Built_in_Functional_Interface;

import java.util.function.Predicate;

/**
 Predicate<T> functional interface:

 gives boolean output

 methods:
 and()
 or()
 negate()
 test()   --> abstract method
 isEqual()
 **/
public class _2predicate_example1 {
    public static void main(String args[]){

        Predicate<String> p1 = (String s) -> s.length() > 5;
        Predicate<String> p2 = (String s) -> s.contains("a");
        System.out.println(p1.test("neethi"));
        System.out.println(p1.and(p2).test("neethiarasan"));
        System.out.println(p1.or(p2).test("neethi"));
        System.out.println(p1.negate().test("neethi"));

        Predicate<String> p = Predicate.isEqual("neethi");
        System.out.println(p.test("neethi"));


    }
}

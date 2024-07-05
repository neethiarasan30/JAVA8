package _1lambda_expression_Functional_Interface;

@FunctionalInterface

interface addition{
    public int add(int a, int b);
}

public class _6lambda_expression_with_or_without_return_keyword {
    public static void main(String args[]){
        // Lambda expression without return keyword.
        addition a1 = (a,b) -> a+b;
        System.out.println(a1.add(5,10));

        // Lambda expression with return keyword.
        addition a2 = (a,b) -> {
           return a + b;
        };
        System.out.println(a1.add(5,20));

    }
}

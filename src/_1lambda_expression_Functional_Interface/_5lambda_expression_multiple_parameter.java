package _1lambda_expression_Functional_Interface;

@FunctionalInterface
interface addable{
    public int add(int a, int b);
}

public class _5lambda_expression_multiple_parameter {
    public static void main(String args[]){

        // Multiple parameters in lambda expression
        addable a1 = (a,b) -> {
             return a+b;
        };
        System.out.println(a1.add(5,25));


        // Multiple parameters with data type in lambda expression
        addable a2 = (int a, int b) -> {
          return a+b;
        };
        System.out.println(a1.add(5,45));

    }
}

package _1lambda_expression_Functional_Interface;

@FunctionalInterface
interface sayable{
    public String say();
}

public class _3lambda_expression_no_parameter {
    public static void main(String args[]){
        sayable s = () -> {
          return "say";
        };
        System.out.println(s.say());
    }
}

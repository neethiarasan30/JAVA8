package _1lambda_expression_Functional_Interface;




@FunctionalInterface
interface drawable{
    public void draw();
}


public class _2lambda_expression_example1 {
    public static void main(String args[]){

        drawable d = () -> System.out.println("draw");
        d.draw();
    }
}

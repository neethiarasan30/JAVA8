package _1lambda_expression_Functional_Interface;

@FunctionalInterface

interface writable{
    public String write(String name);
}

public class _4lambda_expression_single_parameter {
    public static void main(String args[]){

        writable w1 = (String name) -> {
          return name;
        };
        System.out.println(w1.write("neethiarasan"));


        /** we can omit parenthesis and datatype for single parameter **/
        writable w2 =  name -> {
            return name;
        };
        System.out.println(w2.write("manikandan"));

    }
}

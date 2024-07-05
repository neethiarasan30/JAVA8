package _1lambda_expression_Functional_Interface;

@FunctionalInterface

interface watchable{
    public String watch();
}

public class _6lambda_expression_multiple_statements {
    public static void main(String args[]){

        watchable w = () ->
        {
            String s1 = "Neethiarasan";
            String s2 = "Manikandan";
            return s1 + " " + s2;
        };

        System.out.println(w.watch());
    }
}

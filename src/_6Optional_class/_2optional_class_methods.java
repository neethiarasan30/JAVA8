package _6Optional_class;
import java.util.Optional;



public class _2optional_class_methods {
    public static void main(String args[]){
        String s1 = "neethi";
        String s2 = null;


        //empty -- used to create empty optional container
        /**
        Optional<String> op = Optional.empty();
        System.out.println(op);

        **/

        //of -- used to add value -- we cannot give null value
        /**
        Optional<String> op = Optional.of(s1);
        System.out.println(op);
        **/

        //ofNullable -- we can give null value
        /**
        Optional<String> op1 = Optional.ofNullable(s1);
        System.out.println(op1);

        Optional<String> op2 = Optional.ofNullable(s2);
        System.out.println(op2);
        **/

        //isPresent -- if value is notnull returns true
        /**
        Optional<String> op = Optional.ofNullable(s1);
        System.out.println(op.isPresent());
         **/

        Optional<String > op1 = Optional.ofNullable(s1);
        Optional<String > op2 = Optional.ofNullable(s2);

        /**
        //orElse() -- it will return the value if it present else it will return the
        //default value what we give.

        System.out.println(op1.orElse("there is null"));
        System.out.println(op2.orElse("there is null"));



        //orElseGet()  -- it will return the value if it present else it will return the
        // default value what we give through supplier.

        System.out.println(op1.orElseGet(() -> new String("there is null")));
        System.out.println(op2.orElseGet(() -> new String("there is null")));



        //orElseThrow()  it will return the value if it present else it will throw exception
        System.out.println(op1.orElseThrow(() -> new RuntimeException("there is null")));
        System.out.println(op2.orElseThrow(() -> new RuntimeException("there is null")));
        **/



        //filter -- inside filter we were passing predicate and filtering the data based upon condition
        /**
        System.out.println(op1.filter( (x) -> x.contains("e")));
        System.out.println(op1.filter( (x) -> x.contains("a") ));
        **/

        //ifPresent -- if value is notnull specified task will be done
        /**
       op1.ifPresent((x) -> System.out.println(x.concat("arasan")));
       op2.ifPresent( (x) -> System.out.println(x.concat("arasan")));
        **/



        /**
        Optional obj1 = Optional.of("manikandan").
                map( x -> Optional.of(Optional.of(s1.concat("arasan"))));
        System.out.println(obj1);

        Optional obj2 = Optional.of("manikandan").
                flatMap( x -> Optional.of(Optional.of(s1.concat("arasan"))));
        System.out.println(obj1);
        */
    }
}

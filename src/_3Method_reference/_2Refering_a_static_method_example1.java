package _3Method_reference;

@FunctionalInterface
interface sayable{
    public void say();
}

public class _2Refering_a_static_method_example1 {
    public static void saysomething()
    {
        System.out.println("this is static method");
    }

    public static void main(String args[]){

        // Referring static method
        sayable s = _2Refering_a_static_method_example1::saysomething; //class_name::method_name;

        //calling interface method
        s.say();
    }
}

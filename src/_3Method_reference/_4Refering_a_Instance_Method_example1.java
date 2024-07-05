package _3Method_reference;
@FunctionalInterface
interface writable{
    public void write();
}


public class _4Refering_a_Instance_Method_example1 {

    public void writesomething()
    {
        System.out.println("this is instance method");
    }


    public static void main(String args[]){
        _4Refering_a_Instance_Method_example1 m = new _4Refering_a_Instance_Method_example1();

        writable w1 = m::writesomething; //object_name::method_name;
        w1.write();

        // Referring non-static method using anonymous object
        writable w2 = new _4Refering_a_Instance_Method_example1()::writesomething;
        w2.write();
    }
}

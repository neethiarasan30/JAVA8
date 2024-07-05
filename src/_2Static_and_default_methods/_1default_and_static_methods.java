package _2Static_and_default_methods;

/**
 --we can override default methods
 --we cannot override default methods
 **/

@FunctionalInterface
interface drawable{
    //abstract method
    public void draw();

    //default method
    default void msg()
    {
        System.out.println("default method");
    }

    //static method
    static int cube(int x)
    {
        return x*x*x;
    }

}



public class _1default_and_static_methods {
    public static void main(String args[]){
        drawable d = () -> System.out.println("draw");

        d.draw();
        d.msg();
        System.out.println(drawable.cube(5));
    }
}

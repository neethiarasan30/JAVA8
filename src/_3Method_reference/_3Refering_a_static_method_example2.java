package _3Method_reference;

public class _3Refering_a_static_method_example2 {

    public static void threadstatus(){
        System.out.println("Thread is running");
    }

    public static void main(String args[]){

        Runnable r = _3Refering_a_static_method_example2::threadstatus;

        Thread t = new Thread(r);
        t.start();
    }
}

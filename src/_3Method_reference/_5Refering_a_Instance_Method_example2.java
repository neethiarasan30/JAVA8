package _3Method_reference;

public class _5Refering_a_Instance_Method_example2 {

    public void threadstatus()
    {
        System.out.println("thread is running");
    }

    public static void main(String args[]){
        Runnable r = new _5Refering_a_Instance_Method_example2()::threadstatus;

        Thread t = new Thread(r);
        t.start();
    }

}

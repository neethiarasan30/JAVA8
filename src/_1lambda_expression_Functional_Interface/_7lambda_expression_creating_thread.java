package _1lambda_expression_Functional_Interface;

public class _7lambda_expression_creating_thread {
    public static void main(String args[]){
        //Thread Example without lambda
        Runnable r1 = new Runnable() {
            public void run() {
                System.out.println("thread1 is running");
            }
        };

        Thread t1 = new Thread(r1);
        t1.start();

        //Thread Example with lambda
        Runnable r2 = () -> System.out.println("Thread2 is running");

        Thread t2 = new Thread(r2);
        t2.start();

    }
}

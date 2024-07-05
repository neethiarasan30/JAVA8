package PRACTICE;

@FunctionalInterface
interface temp1{
    void add();
}


@FunctionalInterface
interface temp2{
    void sub(int a, int b);
}

@FunctionalInterface
interface temp3{
    int mul(int a, int b);
}

@FunctionalInterface
interface temp4{
    void div(int a, int b);
}


public class practice1 {
    public static void main(String args[]){
        temp1 t1 = () -> {System.out.println("addition");};
        t1.add();

        temp2 t2 = (int a,int b) -> {System.out.println(a-b);};
        t2.sub(15,5);

        temp3 t3 = (int a,int b) -> {return a * b;};
        System.out.println(t3.mul(2,50));

        temp4 t4 = (int a, int b) -> {System.out.println(a/b);};
        t4.div(20,4);
    }
}

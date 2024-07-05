package PRACTICE;

@FunctionalInterface
interface  temp{
    public int display(int n,int m);
}


public class practice3 {
    public static void main(String args[]){

        temp t1 = (n,m)-> {
            return n+m;
        };

        t1.display(5,8);
    }
}

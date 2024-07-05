package Stream;

import java.util.Arrays;
import java.util.List;

public class _1Need_Of_Stream_API {
    public static void main(String args[]){
        List<Integer> a1 = Arrays.asList(4,5,2,7);

        //we can do this kind of operations in Stream API which has some predefined methods

        int sum = 0;
        for(int x: a1)
        {
            //filtering even number
            if(x % 2 ==0)
            {
                //doubling that num
                x = x+x;
                sum = sum+x; //adding in variable
            }
        }

        System.out.println(sum);
    }
}

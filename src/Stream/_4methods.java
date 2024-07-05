package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _4methods {
    public static void main(String args){
        List<Integer> a1 = Arrays.asList(4,5,7,2,10);


        /**
         filter -- inside filter we were passing the -- predicate functional interface
         map    -- inside map we were passing the -- function functional interface
         **/


        int res = a1.stream().filter(x -> x%2 ==0).map(x -> x*2).reduce(0,(x,y)->x+y);
        System.out.println(res);

    }
}

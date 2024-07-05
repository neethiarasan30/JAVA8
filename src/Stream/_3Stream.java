package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _3Stream {
    public static void main(String args[]){
        List<Integer> a1 = Arrays.asList(4,5,7,2,10);

        /**we can convert the above list into stream and can do some operation which
         will not affect the original data of list
         **/

        Stream<Integer> s1 = a1.stream();


        /** stream -- for example stream means flow of water so if you sitting near
         river we cannot touch the same water after it moves.

         likewise in stream we
         can use stream only once. we cannot reuse it.

         for example we cannot print stream elements more than once

         Stream s1 = a1.stream();
         s1.forEach(x -> System.out.println(x));
         s1.forEach(x -> System.out.println(x));  //we cannot use like this


         benefit of stream is that has lot of methods so that we can perform some operations
         methods like filter, map, reduce
          **/


        Stream<Integer> s2 = s1.filter(x -> x%2 ==0); //return type of filter is Stream
        Stream<Integer> s3 = s2.map(x -> x*2); //return type of map is Stream
        int result = s3.reduce(0, (x,y)-> x+y);

        System.out.println(result);

        /** we can write above code in single line **/

        int res = a1.stream().filter(x -> x%2 ==0).map(x -> x*2).reduce(0,(x,y)->x+y);
        System.out.println(res);

    }
}

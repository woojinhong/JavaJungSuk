package Ch14;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class lambdas {
    public static void main(String[] args) {
        Function<Integer, Integer> r = ( a)->a+100;

        System.out.println(r.apply(10));

        Supplier<String> s= ()-> "tyu";

        System.out.println(s.get());

        Integer[] ss= new Integer[]{1,2,33,4,5,6};


        int[] z = {1,2,3,4,5,6};

        Arrays.sort(z);
        Arrays.sort(ss);

        HashSet set = new HashSet();
        set.add(1);

        Set set1 = new HashSet();
        set.add(1);

    }



}

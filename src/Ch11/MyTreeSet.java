package Ch11;

import com.sun.source.tree.Tree;

import java.util.*;

public class MyTreeSet {
    public static void main(String[] args) {


        Map m = new HashMap();
        Set set = new TreeSet();
        for(int i = 0 ;  set.size() <6; i++){
            set.add(i);
        }

        List li = new LinkedList(set);

        System.out.println("li = " + li);


        li.sort(Collections.reverseOrder());

        System.out.println("lis = " + li);

        System.out.println(Collections.binarySearch(li,2));

        System.out.println("lis = " + li);
    }
}

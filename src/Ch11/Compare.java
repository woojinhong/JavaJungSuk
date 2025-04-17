package Ch11;

import java.util.*;

public class Compare {

    public static void main(String[] args) {

        List<Integer> li = new ArrayList<Integer>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(1);
        Collections.sort(li.reversed());
        Collections.fill(li, 5);

        li.iterator();


        for (Object i : li)
            System.out.println("i = " + i);

//        Integer i = new Integer(5);
//        Integer iv = new Integer(6);
//        i.compareTo(iv);
//        System.out.println("iv = " + iv);
//
//    }
//}
//class anotherCompare implements Comparator{
//
//    public int compares(Integer o1, Integer o2) {   // 타입 강제성 부여한 메서드
//            return o1>o2?1:(o1==o2?0:-1);
//    }
//
//    @Override
//    public int compare(Object o1, Object o2) {      // 느슨한 타입 체크
//        if (o1 instanceof Integer && o2 instanceof Integer)
//            return -1;
//
//        return 0;
//    }
    }
}

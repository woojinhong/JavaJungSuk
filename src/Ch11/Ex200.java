package Ch11;

import java.util.*;

public class Ex200 {
    public static void main(String[] args) {

        Collection c = new PriorityQueue();
        List l = new ArrayList();
        Set s = new LinkedHashSet();
        Queue pq = new PriorityQueue();

        pq.offer(3);   // pq.offer(new Integer(3)) 오토박싱
        pq.offer(100);
        pq.offer(16);


        System.out.println("pq = " + pq);

        Object obj =null;

        // PriorityQueue 저장된 요소 하나씩 추출
        while((obj = pq.poll())!=null)
            System.out.println(obj);


    }
}

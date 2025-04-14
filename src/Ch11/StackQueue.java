package Ch11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue {
    public static void main(String[] args) {
        Stack st = new Stack();
        Queue q = new LinkedList();


        st.push("0");
        st.push("1");

        q.offer("0");
        q.offer("1");

        System.out.println("=Stack= ");
        while(!st.empty()){
            System.out.println(st.pop());
        }
        System.out.println("=Queue= ");
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }

    }
}

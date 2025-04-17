//package Ch11;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//
//public class Ex15 {
//    public static void main(String[] args) {
//        ArrayList<String> original = new ArrayList<>(10);
//        ArrayList<Object> copy1 = new ArrayList<Object>(10);
//        ArrayList<Object> copy2 = new ArrayList<Object>(10);
//
//        for(int i = 0; i< 10 ; i ++){
//            original.add(i+"");
//        }
//        Iterator it = original.iterator();
//        while (it.hasNext()){
//            copy1.add(it.next());
//
//        }
//        it = original.iterator();
//
//        while(it.hasNext()){
//            copy2.add(it.next());
//            it.remove();
//        }
//        System.out.println("original = " + original);
//        System.out.println("copy2 = " + copy2);
//
//
//
//        Person<Integer> p = new Person<Integer>();
//        p.add(1);
//    }
//}
////
////class Person<T extends Object>{
////
////    public T add (T e){
////        return e +1;
////    }
//}
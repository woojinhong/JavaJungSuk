//package Ch11;
//
//import java.sql.SQLOutput;
//import java.util.Arrays;
//import java.util.Comparator;
//
//public class Ex31 {
//    public static void main(String[] args) {
//
//        String[] strArr  = {"cat", "Dog", "lion", "tiger"};
//
//        Arrays.sort(strArr);  // String의 Comparable 구현에 의한 정렬
//        System.out.println("Arrays.toString(strArr) = " + Arrays.toString(strArr));
//
//        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분안함
//        System.out.println("Arrays.toString(strArr) = " + Arrays.toString(strArr));
//
//        Arrays.sort(strArr, new Descending()); // 역순 정렬
//    }
//}
//
//class Descending implements Comparator {
//
//    @Override
//    public int compare(Object o1, Object o2) {
//        if(o1 instanceof  Comparable && o2 instanceof Comparable){
//            Comparable c1= (Comparable)o1;
//            Comparable c2 = (Comparable)o2;
//
//            return c1.compareTo(c2) * -1;
//        }
//        return -1;
//    }
//}

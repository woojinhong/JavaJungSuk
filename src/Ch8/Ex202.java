package Ch8;

public class Ex202 {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println("str1.hashCode() = " + str1.hashCode());
        System.out.println("str2.hashCode() = " + str2.hashCode());
//        System.out.println("str2.hashCode() = " + System.identityHashCode(str1));
//        System.out.println("str2.hashCode() = " + System.identityHashCode(str2));


        int[] arr = {1,2,3,4,5};

        int[] arrCopy = arr.clone();

        System.out.println("arr = " + arr);
        System.out.println("arrCopy = " + arrCopy);
        System.out.println("arr.hashCode() = " + arr.hashCode());
        System.out.println("arrCopy.hashCode() = " + arrCopy.hashCode());
    }
}

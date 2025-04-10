package Ch8;

public class Ex500 {
    public static void main(String[] args) {

        int i = Integer.parseInt("100");

        StringBuffer sb = new StringBuffer();
        sb.append("zz");

        System.out.println("sb.capacity() = " + sb.capacity());
        System.out.println("sb.length() = " + sb.length());

    }
}

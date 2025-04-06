import java.util.Scanner;
//추가 문제: ch가 'A'일 때 'ABCDE'가 출력되도록 코드를 수정하시오.
public class Main {
    public static void main(String[] args) {
        int count = 5;
        char ch = 'A';

        String result = "";
        for (int i = 0; i < count; i++) {

            result += ch;
            ch = (char)(ch+1);
        }

        System.out.println(result);
    }
    }
// 1 1  -> 2 -> 1+2 -> 3 -> 3+2 -> 5

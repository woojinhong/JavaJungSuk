package Ch4;

public class Ex4 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i =1; sum<100; i++){
            sum += (i%2==0)?-i:i;
            System.out.println("sum = " + sum);
        }




        for(int i =0,f= 4, h = 6, os = 10; i <100 && h<29 && os>=4 ; i ++, h+=3 ){

        }


        int sums = 0; // 총합
        int s = 1;    // 부호 변경
        int num = 0;  // 부호 정수 값

        for(int i=1;true; i++, s=-s) { //
            num = s * i; // i와 부호(s)를 곱해서 더할 값을 구한다.
            sums += num;
            if(sums >=100) // 총합이 100보다 같거나 크면 반복문을 빠져 나간다.
                break;
        }
    }
}

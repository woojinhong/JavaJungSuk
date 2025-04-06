package Ch3;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {

    static final int DICE_NUM = 6;
    static final int ONE3_BONUS = 1000;
    static final int FIVE_BONUS = 50;
    static final int ONE_BONUS = 500;
    static final int MULTIPLE = 2;


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // 주사위 배열 저장소
        int[] dice = new int[DICE_NUM];

        // 주사위 카운터 저장소  +1 해야함
        int[] counterArr = new int[DICE_NUM+1];

        // 주사위 카운터
        int counter =0;

        // 결과 값 저장
        int result =0;

        for(int i = 0; i <dice.length; i++){
            // 주사위 배열 랜덤 값 저장
            dice[i] = (int)(Math.random()*6)+1;
            // 주사위 카운터 숫자 저장소
            counterArr[dice[i]]++;
        }

        // 주사위 한개씩 출력
        System.out.println(Arrays.toString(dice));
        System.out.println("Arrays.toString(counterArr) = " + Arrays.toString(counterArr));


        // 5번째 다이스를 가지고옴
        for(int i = 0; i < dice.length; i++){
            if(counterArr[i]>1){
                if(counterArr[i]==2){
                    result += ONE_BONUS*2;
                }
                else if (counterArr[i]==5){
                    result += FIVE_BONUS*2^2;
                }else{
                    result += ONE_BONUS*2^3;
                }
            }
            // 1,5
            result += calculator(counterArr[i]);

            //1, 2, 3, 4, 5의 조합은 750, 그리고 2, 3, 4, 5, 6은 1250, 또 1, 2, 3, 4, 5, 6은 2000


        }
    }


    static int calculator(int counterValue){

        // 1=100, 5 = 50
        if(counterValue== 1){
            return ONE_BONUS;
        } if(counterValue== 5){
            return FIVE_BONUS;
        }
        return 0;
    }
}

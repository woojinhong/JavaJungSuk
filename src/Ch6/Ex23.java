package Ch6;

import java.util.Arrays;

public class Ex23 {
    public static void main(String[] args) {

        Excercise6_23 a = new Excercise6_23();
        int[] data = {3,2,9,4,7};
        System.out.println(Arrays.toString(data));
        System.out.println(a.max(data));
        System.out.println("a.max(null) = " + a.max(null));
        System.out.println("a.max(new int[]{}) = " + a.max(new int[]{}));
    }
}

class Excercise6_23{
    int max(int[] arr){

        int maxValue ;
        if(arr == null || arr.length==0){
            maxValue=-99999;
            return maxValue;
        }
        // 배열의 첫번째 요소 저장

        maxValue= arr[0];

        // max 값 찾기
        for(int i = 1; i<arr.length; i++)
            // 임시 값과 배열의 각 요소 비교
            if(maxValue<arr[i]){
                maxValue=arr[i];
            }

        return maxValue;
    }
}

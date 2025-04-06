package Ch6;

import java.util.Arrays;

public class Ex20 {

    static int[] shuffle(int[] arr){
        int tmp ;
        int ran ;
        for(int i =0; i<arr.length; i++){
            ran = (int)(Math.random()* 9);
            tmp = arr[i];
            arr[i]=arr[ran];
            arr[ran] = tmp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] original ={1,2,3,4,5,6,7,8,9};


        int[] result = shuffle(original);

        System.out.println(Arrays.toString(result));
    }
}

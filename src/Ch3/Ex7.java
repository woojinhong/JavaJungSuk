package Ch3;
/**
 * 섭씨 구하는 문제
 * **/
public class Ex7 {
    public static void main(String[] args) {

        int farenheit = 100;
        float celcius = (int)(5f/9 * (farenheit-32)*100+0.5)/100f;

        System.out.println("celcius = " + celcius);
    }
}

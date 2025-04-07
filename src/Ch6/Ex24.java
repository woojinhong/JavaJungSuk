package Ch6;



public class Ex24 {
    
    static int abs(int value){
        return Math.abs(value);
    }
    
    public static void main(String[] args) {
        int value = 5;
        System.out.println("abs(value) = " + abs(value));
        
        value = -10;
        System.out.println("abs(value) = " + abs(value));
    }
}



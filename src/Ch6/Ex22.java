package Ch6;

public class Ex22 {

    public static void main(String[] args) {

    }
}

class Exercise6_22{
    boolean isNumber(String str){

        if(str==null || str.equals(""))
            return false;
        for(int i =0; i< str.length(); i++){
            char ch = str.charAt(i);
            if(!(ch>='0'&&ch<='9'))
                return false;
        }
        return true;
    }
}

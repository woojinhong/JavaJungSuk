package Ch6;

public class Ex1 {
    public static void main(String[] args) {

        SutdaCard card = new SutdaCard(0,'광');

        System.out.println("card.isKwang = " + card.isKwang);
        System.out.println("card.isKwang = " + card.num);
    }
}

class SutdaCard{
    int num;
    boolean isKwang;

    public SutdaCard(int num, char isKwang){
        // num이 0보다 크고, 11보다 작을때
        if(!(num>0 && num<11)){
            throw new IllegalArgumentException("카드 숫자는 1~10 사이만 유효합니다.");
        }
        this.num = num;
        this.isKwang=isKwang=='광'?true:false;
    }
}
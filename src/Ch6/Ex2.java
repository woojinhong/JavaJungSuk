package Ch6;

public class Ex2 {
    public static void main(String[] args) {

        SutdaCard2 card1 = new SutdaCard2(3,false);
        SutdaCard2 card2 = new SutdaCard2();

        card1.info();
        card2.info();
    }
}
class SutdaCard2{
    int num;
    boolean isKwang;

    public SutdaCard2(){
        this(1,true);
    }
    public SutdaCard2(int num, boolean isKwang){
        // num이 0보다 크고, 11보다 작을때
        if(!(num>0 && num<11)){
            throw new IllegalArgumentException("카드 숫자는 1~10 사이만 유효합니다.");
        }
        this.num = num;
        this.isKwang=isKwang;
    }
    public void info(){
        System.out.println(num+(isKwang?"K":""));
    }
}

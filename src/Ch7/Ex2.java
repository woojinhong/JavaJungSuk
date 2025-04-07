package Ch7;
class SutdaDeck1{
    final int CARD_NUM=20;
    SutdaCard1[] cards= new SutdaCard1[CARD_NUM];
    boolean isKwang;

    int ran = 0;
    SutdaCard1 tmp;
    SutdaDeck1(){
        // 카드 덱 순회
        for(int i = 0; i<10; i++){
            // 1,3,8 광
            isKwang= (i==0||i==2||i==7)?true:false;
            cards[i] = new SutdaCard1(i + 1, isKwang);

            isKwang =false;
            cards[i + 10] = new SutdaCard1(i + 1, isKwang);
        }
    }

    void shuffle(){

        for(int i = 0; i<cards.length; i++){
            ran=(int)(Math.random()*cards.length);
            tmp = cards[i];
            cards[i]= cards[ran];
            cards[ran]= tmp;
        }
    }
    SutdaCard1 pick(int index){
        return cards[index];
    }
    SutdaCard1 pick(){
        return cards[(int)(Math.random()*CARD_NUM)];
    }


}

public class Ex2 {
    public static void main(String[] args) {
        SutdaDeck1 deck1 = new SutdaDeck1();

        System.out.println(deck1.pick(0));
        System.out.println(deck1.pick());
        for(int i = 0; i <deck1.cards.length; i++){
            System.out.print(deck1.cards[i]);
        }
        System.out.println();
        deck1.shuffle();
        for(int i = 0; i <deck1.cards.length; i++){
            System.out.print(deck1.cards[i]);
        }
        System.out.println();
        System.out.println(deck1.pick(0));
    }
}

class SutdaCard1{
    int num;
    boolean isKwang;

    SutdaCard1(){
        this(1,true);
    }

    SutdaCard1(int num, boolean isKwang){
        this.num = num;
        this.isKwang= isKwang;
    }

    public String toString(){
        return num +(isKwang? "K":"");
    }
}

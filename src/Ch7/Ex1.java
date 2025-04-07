package Ch7;

class SutdaDeck{
    final int CARD_NUM=20;
    SutdaCard[] cards= new SutdaCard[CARD_NUM];
    boolean isKwang;

    SutdaDeck(){
        // 카드 덱 순회
        for(int i = 0; i<10; i++){
            // 1,3,8 광
            isKwang= (i==0||i==2||i==7)?true:false;
            cards[i] = new SutdaCard(i + 1, isKwang);

            isKwang =false;
            cards[i + 10] = new SutdaCard(i + 1, isKwang);
        }
    }
}

public class Ex1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        for(int i = 0; i <deck.cards.length; i++){
            System.out.print(deck.cards[i]);
        }
    }
}

class SutdaCard{
    int num;
    boolean isKwang;

    SutdaCard(){
        this(1,true);
    }
    SutdaCard(int num, boolean isKwang){
        this.num = num;
        this.isKwang= isKwang;
    }

    public String toString(){
        return num +(isKwang? "K":"");
    }
}

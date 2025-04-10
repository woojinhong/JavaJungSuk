package Ch7;

import java.util.Vector;

public class Ex100 {
    public static void main(String[] args) {
        Buyer1 b = new Buyer1();
        b.buy(new Tv1());

        b.buy(new Computer1());

        b.buy(new Tv1());

        b.buy(new Audio1());

        b.buy(new Computer1());
        b.buy(new Computer1());
        b.buy(new Computer1());

        b.summary();

    }
}

class Buyer1{
    int money = 1000;
    Vector<Product1> cart = new Vector<Product1>();  // 구입한 제품을 저장하기 위한 배열
    int i = 0;

    // 제품 구입을 위한 메서드
    void buy(Product1 p){
        // 1. 지정된 물건 구입  : 가진 돈 (money) - 물건의 가격 p.tv
        if (money < p.price)
            return;
        // 2. 가진 돈(money) < 물건의 가격
        money = money- p.price;
        // 3. 장바구니에 담기 -> add() 호출
        add(p);
        // return;
    }

    // 장바구니 추가 메서드
    void add(Product1 p){
        //2. 저장
        cart.add(p);
    }

    void summary(){

        int sum=0;
        // 1. cart 목록
        while(cart.iterator().hasNext()){
            sum += cart.get(i).price;
            i++;
            // 2. 제품 총가격
        }
        // 2. 제품 총가격 출력
        System.out.println("총 가격:" + sum);


        // 3. 남은 금액 출력
        System.out.println("남은 금액:" + money);
    }
}

class Product1{
    int price; // 가격

    Product1(int price){
        this.price = price;
    }
}

class Tv1 extends Product1{
    Tv1() {super(100);}

    public String toString (){return "Tv";}
}

class Computer1 extends Product1{
    Computer1() {super(200);}

    public String toString (){return "Computer";}
}
class Audio1 extends Product1{
    Audio1() {super(50);}

    public String toString (){return "Audio";}
}
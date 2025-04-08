package Ch7;

import java.util.Arrays;

public class Ex19 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv());

        b.buy(new Computer());

        b.buy(new Tv());

        b.buy(new Audio());

        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());

        b.summary();

    }
}

class Buyer{
    int money = 1000;
    Product[] cart = new Product[3];  // 구입한 제품을 저장하기 위한 배열
    int i = 0;                        // Product배열 cart에 사용될 인덱스

    // 제품 구입을 위한 메서드
    void buy(Product p){
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
    void add(Product p){
        // 1. 장바구니에 담을 공간 x -> cart.length * 2 (두배로 늘린다음 제품을 담는다)
        if(i>= cart.length){
            //1.1 장바구니 2배로 늘린다

            // 1.2 복사
            cart = Arrays.copyOf(cart, cart.length*2);
        }

        // 2. 저장
        cart[i]= p;
        // 3. cart 인덱스 1 증가
        i++;

    }

    void summary(){

        int sum=0;
        // 1. cart 목록
        for(int i = 0; i< cart.length; i++){
            System.out.println(cart[i]);     // toString은 숨겨짐
            // 2. 제품 총가격
            sum+=cart[i].price;
        }
        // 2. 제품 총가격 출력
        System.out.println("총 가격:" + sum);


        // 3. 남은 금액 출력
        System.out.println("남은 금액:" + money);
    }
}

class Product{
    int price; // 가격

    Product(int price){
        this.price = price;
    }
}

class Tv extends Product{
    Tv() {super(100);}

    public String toString (){return "Tv";}
}

class Computer extends Product{
    Computer() {super(200);}

    public String toString (){return "Computer";}
}
class Audio extends Product{
    Audio() {super(50);}

    public String toString (){return "Audio";}
}
package Ch13;

// 1. 전략 인터페이스
interface PaymentStrategy {
    void pay(int amount);
}
// 2. 구체 전략 클래스들
class CardPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println(":credit_card: 카드로 " + amount + "원 결제");
    }
}
class CashPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println(":dollar: 현금으로 " + amount + "원 결제");
    }
}
// 3. 컨텍스트: 전략을 받아 실행함
class PaymentProcessor {
    private PaymentStrategy strategy;
    // 전략을 런타임에 바꿀 수 있음
    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }
    public void process(int amount) {
        if (strategy == null) {
            System.out.println("⚠ 결제 수단이 설정되지 않았습니다.");
        } else {
            strategy.pay(amount);
        }
    }
}
// 4. 실행
public class StrategyPatternExample {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        processor.setStrategy(new CardPayment());
        processor.process(10000);  // 카드로 10000원 결제
        processor.setStrategy(new CashPayment());
        processor.process(5000);   // 현금으로 5000원 결제
    }
}

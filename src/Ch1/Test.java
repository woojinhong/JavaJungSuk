package Ch1;

public class Test {
    public static void main(String[] args) {
        Animal a =new Dog();

        Dog d = (Dog)a;
    }
}

class Animal {
    void sound(){
        System.out.println("동물 울음 소리");
    }
}

class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("멍멍");
    }

    void walk(){
        System.out.println("뚜벅뚜벅");
    }
}

package Ch7;
/**
 *
 *
 *  실패한 문제
 *  왜?
 *  이전 상태 값을 어떻게 저장하나?
 *  @gotoPrevChannel() -> 이전의 상태값 저장하는 방법을 모르겠다.
 */
public class Ex11 {
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();

        t.setChannel(10);
        double a = Math.random()*10;
        System.out.println("t.getChannel() = " + t.getChannel());

        t.setChannel(20);

        System.out.println("t.getChannel() = " + t.getChannel());
//
        t.gotoPrevChannel();
        System.out.println("t.getChannel() = " + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("t.getChannel() = " + t.getChannel());
    }
}

class MyTv2{
    // 채널
    private int channel;
    // 이전 채널 값
    private int prev;

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        prev = this.channel;
        this.channel = channel;

    }


    public void gotoPrevChannel(){
        setChannel(prev);
   }

}

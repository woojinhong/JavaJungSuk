package Ch6;

public class Ex21 {
    public static void main(String[] args) {

        MyTv tv = new MyTv();

        tv.channel= 100;
        tv.volume=0;

    }
}

class MyTv {
        boolean isPowerOn;
        int channel;
        int volume;
        final int MAX_VOLUME= 100;
        final int MIN_VOLUME= 0;
        final int MAX_CHANNEL= 100;
        final int MIN_CHANNEL=1;

        void turnOnOff(){
            isPowerOn = isPowerOn?false:true;
        }

        void volumeUp(){
            if(volume<MAX_VOLUME){
                volume++;
            }

        }
        void volumeDown(){
            if(volume>MIN_VOLUME){
                volume--;
            }
        }
        void channelUp(){
            channel++;
           if(channel==MAX_CHANNEL){
               channel = MIN_CHANNEL;
           }
        }

}

package Ch7;

public class Ex17 {
}

class Units{
    int x,y;
    void move(int x, int y){}
    void stop(){}
}

class Marine extends Units {
    int x,y;
    void move(int x, int y){}
    void stop(){}
    void stimPack(){}
}

class Tank extends Units{
    int x,y;
    void move(int x, int y){}
    void stop(){}
    void changeMode(){}
}

class Dropship extends Units{
    int x,y;
    void move(int x, int y){}
    void stop(){}
    void load(){}
    void unload(){}
}
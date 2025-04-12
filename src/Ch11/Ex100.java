package Ch11;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Ex100 {
    public static void main(String[] args) {
        final int LIMIT = 10;
        Vector v = new Vector(5);
        String source = "11111111111111111111";
        int length = source.length();

        List list = new ArrayList(length/LIMIT +10);

        for(int i = 0; i < length; i+=LIMIT){
            if(i+LIMIT < length)
                list.add(source.substring(i, i+LIMIT));
            else
                list.add(source.substring(i));
        }

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}

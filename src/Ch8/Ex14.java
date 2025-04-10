package Ch8;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex14 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis= null;
        DataInputStream dis = null;
        try {
              fis = new FileInputStream("aa");
              dis = new DataInputStream(fis);
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            dis.close();
        }
    }
}

package Ch8;

import java.sql.SQLException;

public class Ex500 {
    public static void main(String[] args) {


        try{
            if(false){
                throw new SQLException();
            }else {
                throw new RuntimeException();
            }
        }catch(SQLException e){

        } finally{
          throw new IllegalArgumentException();
        }
    }
}

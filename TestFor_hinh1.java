/*
********
*******
******
*****
****
***
**
*
*/


import java.net.NoRouteToHostException;

public class TestFor_hinh1 {
    public static void hinh1(int h) {
        for(int i = 0;i<h;i++){
            for(int j=i;j<h;j++){
                System.out.print("*");
            }
            System.out.println (); 
                
            
        }
    }
    public static void main(String[] args) {
        hinh1(10);
        
    }
}

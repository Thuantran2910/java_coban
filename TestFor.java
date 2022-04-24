//S(x,n)= x + x^2/1+2 + x^3/1+2+3 + ... + x^n/1+2+...+n
import java.util.Scanner;
public class TestFor{

    public static double Tinh(int n, int x) {
        double s = 0;
        double mau = 0;
        for(int i=1;i<=n;i++){
            double tu = Math.pow(x, i);
            for(int j=1;j<=i;j++){
                mau = mau + j;
            }
            s= s+tu/mau;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap x: ");
        int x = sc.nextInt();
        System.out.print("nhap n: ");
        int n =sc.nextInt();
        double s = Tinh(x,n);
        System.out.println("S("+x+","+n+")="+s);   
    }
}
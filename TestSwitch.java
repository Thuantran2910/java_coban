import java.util.Scanner;

public class TestSwitch {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a: ");
        int a = sc.nextInt(); 
        System.out.println("nhap b: ");
        int b = sc.nextInt(); 
        System.out.println("phep toan: ");
        char ch = new Scanner(System.in).nextLine().charAt(0);
        switch (ch) {
            case '+':
                System.out.println(a+"+"+b+"="+(a+b));
                break;
            case '-':
                System.out.println(a+"-"+b+"="+(a-b));
                break;
            case '*':
                System.out.println(a+"*"+b+"="+(a*b));
                break;
            case '/':
                if(b==0){
                    System.out.println("Mau =0");
                }else{
                    System.out.println(a+"/"+b+"="+(a/b));
                }
                break;
            default:
                System.out.println("nhap bua!!");
                break;
        }
    }
}


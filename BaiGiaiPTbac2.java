import java.util.Scanner;
class BaiGiaiPTbac2{
    /**
     * @param a -he so a
     * @param b -he so b
     * @param c -he so c
     */
    public static void giaiPTB2(double a, double b, double c){
        if(a==0){
            System.out.println("PT tro thanh bac 1");
            if(b==0 && c==0){
                System.out.println("pt vo so nghiem");           
            }else if(b==0 && c!=0){
                System.out.println("pt vo nghiem");
            }else{
                //bx+c=0    ->bx=-c     ->x=-c/b
                System.out.println("PT cos nghiem x = " + (-c/b));
            }
        }else{
            double delta = b*b-4*a*c;
            if(delta <0){
                System.out.println("pt vo nghiem delta<0");
            }else if(delta==0){
                System.out.println("pt co ngiem kep x1=x2=" + (-b/(2*a)));               
            }else{
                double x1 = (-b-Math.sqrt(delta))/(2*a);
                double x2 = (-b+Math.sqrt(delta))/(2*a);
                System.out.println("pt co 2 nghiem phan biet, x1="+x1+";x2="+x2);
            }
        }
    }
    public static void main(String[] args) {
        
        System.out.println("GIA PHUONG TRINH BAC 2");
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("nhap a: ");
            double a = sc.nextDouble(); 
            System.out.println("nhap b: ");
            double b = sc.nextDouble(); 
            System.out.println("nhap c: ");
            double c = sc.nextDouble(); 
            giaiPTB2(a,b,c);
            System.out.println("tiep ko?(c/k): ");
            String line = new Scanner(System.in).nextLine();
            if(line.equalsIgnoreCase("k"))
                break;
        }while(true);
        System.out.println("thanks you!!");
    }
}
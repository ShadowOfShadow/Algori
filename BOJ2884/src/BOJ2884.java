import java.util.Scanner;

public class BOJ2884 {
    public static void main(String[] args) throws Exception{
       Scanner scan = new Scanner(System.in);
       
       int H = scan.nextInt();
       int M = scan.nextInt();
       scan.close();

       M = M-45;
       
       if(H>0 && M<0) {
           H = H-1;
           M = M+60;
           System.out.println(H + " " + M);
       }
       else if(H<=0 && M<0) {
           H = H-23;
           M = M+60;
           System.out.println(-H + " " + M);
       }
       else {
           System.out.println(H + " " + M);
       }      
    }      
}
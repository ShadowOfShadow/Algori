import java.util.Scanner;
public class BOJV22588 {
    public static void main(String[] args) throws Exception{
         Scanner scan = new Scanner(System.in);
       
         int A = scan.nextInt();
         String B = scan.next();
        
         scan.close();
        
         System.out.println(A * (B.charAt(2) - '0'));
         System.out.println(A * (B.charAt(1) - '0'));
         System.out.println(A * (B.charAt(0) - '0'));
         System.out.println(A * Integer.parseInt(B));           
    }
}
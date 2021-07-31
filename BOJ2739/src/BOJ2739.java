import java.util.Scanner;

public class BOJ2739 {
    public static void main(String[] args) throws Exception{
       Scanner scan = new Scanner(System.in);
       
       int N = scan.nextInt();
       scan.close();
       
       for(int i=1; i<=9; i++) {
           System.out.print(N + " * " + i + " = " + N*i);
           System.out.print("\n");
       }
    }      
}
import java.util.Scanner;

public class BOJ9498 {
    public static void main(String[] args) throws Exception{     
        Scanner scan = new Scanner(System.in);
        
        int A = scan.nextInt();        
        
        switch(A/10) {
            case  10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
                break;
        }
    }
}

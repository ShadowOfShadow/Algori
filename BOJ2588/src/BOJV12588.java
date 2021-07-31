import java.util.Scanner;
public class BOJV12588 {
    public static void main(String[] args) throws Exception{
         Scanner scan = new Scanner(System.in);
       
         int a = scan.nextInt();
         int b = scan.nextInt();
        
         int b1 = b%10; //  1번째 자리수만
         int b2 = (b%100)/10; // 2번째 자리수까지       
         int b3 = b/100; // 3번째 자리수
        
         int fl = a*b1;
         int sl = a*b2;
         int tl = a*b3;
        
         int result = (fl)+(sl*10)+(tl*100);
        
         System.out.println(fl);
         System.out.println(sl);
         System.out.println(tl);
         System.out.println(result);     
    }
}

/*
-------------------------------------------------------
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class BOJ2588 {
    public static void main(String[] args) throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       int A = Integer.parseInt(br.readLine());
       int B = Integer.parseInt(br.readLine());
       
       StringBuilder sb = new StringBuilder();
       
       sb.append(A * (B%10));
       sb.append('\n');
       
       sb.append(A * (B%100)/10);
       sb.append('\n');
       
       sb.append(A * (B/100));
       sb.append('\n');
       
       sb.append(A * B);
       
       System.out.print(sb);          
    }
}
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class BOJ1008 {
    public static void main(String[] args) throws Exception{
       
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         String s = br.readLine();
         StringTokenizer st = new StringTokenizer(s);
         int a = Integer.parseInt(st.nextToken());
         int b = Integer.parseInt(st.nextToken());
         System.out.println((double)(a)/b);        
    }
}
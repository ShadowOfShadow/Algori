import java.io.BufferedReader;
import java.io.InputStreamReader;
public class BOJV31330 {
    public static void main(String[] args) throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String[] s = br.readLine().split(" ");
       int A = Integer.parseInt(s[0]);
       int B = Integer.parseInt(s[1]);
               
       
       String str = (A>B) ? ">" : ((A<B) ? "<" : "==");
       System.out.println(str);
    }
}
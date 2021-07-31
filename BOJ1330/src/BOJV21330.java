import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class BOJV21330 {
    public static void main(String[] args) throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));       
       String s = br.readLine();
       StringTokenizer st = new StringTokenizer(s);
       int A = Integer.parseInt(st.nextToken());
       int B = Integer.parseInt(st.nextToken());
       
       String str = (A>B) ? ">" : ((A<B) ? "<" : "=="); // 삼항 연산자 이용
       System.out.println(str);
    }
}
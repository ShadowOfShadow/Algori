import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJV111021 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		
		int[] plusArray = new int[T];
		
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			plusArray[i] = A+B;
		}
		
		for(int i = 0; i < T; i++) {
			System.out.print("Case #"+(i+1)+": "+ plusArray[i] +"\n");			
		}
	}
}

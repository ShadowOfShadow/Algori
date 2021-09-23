import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJV12908 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		String result1 = "";
		String result2 = "";
		
		for(int i = 2 ; i >= 0 ; i--) {
			result1 += (Integer.toString(A).charAt(i) - '0');
			result2 += (Integer.toString(B).charAt(i) - '0');
		}
		
		System.out.println(Integer.parseInt(result1) > Integer.parseInt(result2) ? result1 : result2);
		
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJV111720 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testCase = Integer.parseInt(br.readLine());
		
		int sum = 0 ;
			
		String N = br.readLine();
		int[] result = new int[testCase];
		
		for(int i = 0 ; i < testCase ; i++) {
			result[i] = N.charAt(i) -'0';
			sum += result[i];
		}
		
		System.out.println(sum);
		
	}

}

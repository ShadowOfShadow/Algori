import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJV13052 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] result = new int[10];
		
		int count = 0;
		
		int[] cal = new int[42];
		
		for(int i = 0 ; i < result.length ; i++) {
			int temp = (Integer.parseInt(br.readLine()))%42;
			result[i] = temp;
			cal[temp]++;
		}
		
		for(int j = 0 ; j < 42 ; j++) {
			if(cal[j] > 0) count++;			
		}
		
		System.out.println(count);
	}
}

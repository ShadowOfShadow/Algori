import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2562 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
						
		int[] number = new int[9];
		
		int index = 0;
		int max = 0;
		
		for(int i = 0 ; i < 9 ; i++) {
			number[i] = Integer.parseInt(br.readLine());
			if(number[i] > max) {
				max = number[i];
				index = i + 1;
			} 			
		}		
		System.out.print(max + "\n" + index);		
	}
}

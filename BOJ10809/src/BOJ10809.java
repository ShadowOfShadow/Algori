import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ10809 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		int[] alpha = new int[26];
		Arrays.fill(alpha, -1);
		
		String S = br.readLine();
		
		for(int i = 0 ; i < S.length() ; i++) {
			char ch = S.charAt(i); // 아스키 코드
			if(alpha[ch - 97] == -1) {
				alpha[ch - 97] = i;
			}
		}
		
		for(int value : alpha) {
			System.out.print(value + " ");
		}
		
	}

}

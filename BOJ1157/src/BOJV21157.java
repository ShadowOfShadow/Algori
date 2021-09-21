import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJV21157 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		
		int[] alpha = new int[26];
		
		for(int i = 0 ; i < S.length() ; i++) { // 문자열의 각각의 중복되는 수마다 +1
			if(65 <= S.charAt(i) && S.charAt(i) <= 90) {
				alpha[S.charAt(i) - 65] ++;
			}
			else {
				alpha[S.charAt(i) - 97]++;
			}
		}
		
		int max = -1;
		char ch = '?';
		
		for(int i = 0 ; i < 26 ; i++) {
			if(alpha[i] > max) {
				max = alpha[i];
				ch = (char)(i+65);
			}
			else if (alpha[i] == max) {
				ch = '?';
			}
		}
		
		System.out.print(ch);
		
		
	}

}

import java.io.IOException;

public class BOJV31157 {

	public static void main(String[] args) throws IOException {
		
		int[] alpha = new int[26];
		
		int c = System.in.read();
		
		while(c > 64) {
			if(c < 91) {
				alpha[c - 65]++; // 대문자
			} else {
				alpha[c - 97]++; // 소문자
			}
			c = System.in.read();
		}
		
		int max = -1;
		int ch = -2; // ?는 63
		
		for(int i = 0 ; i < 26 ; i++) {
			if(alpha[i] > max) {
				max = alpha[i];
				ch = i;
			}else if(alpha[i] == max) {
				ch = -2; // ?
			}
		}
		System.out.print((char)(ch+65));
		
	}

}

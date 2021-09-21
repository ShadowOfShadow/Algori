import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJV11157 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		
		int[] alpha = new int[26];
		
		int max = -1;		
		
		for(int i = 0 ; i < S.length() ; i++) { // ���ĺ��� �и��Ͽ� �ݺ��� ��ŭ alpha ��ġ�� ++
			int tmp = S.charAt(i);
			if((97 <= tmp) && (tmp <= 122)) { // �ҹ���
				tmp -= 32;
			}
			alpha[tmp-65]++;
		}
		
		for(int j = 0 ; j < alpha.length ; j++) { // �ִ� ��ġ ã��
			if(alpha[j] > max) {
				max = alpha[j];
			}
		}				
		
		int count = 0;
		char result = 0;
		for(int k = 0 ; k < alpha.length ; k++) {
			if(max == alpha[k]) {
				result = (char)(k+65);
				count++;
			}
		}
		if(count > 1) {
			System.out.println("?");
		}
		else {
			System.out.println(result);
		}
		
	}

}

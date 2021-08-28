import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJV11110 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		if(N <10)
			N *= 10;	
		
		int temp1;
		int temp2;
		int temp3;
		String result;
		int i = 0;
		
		int O = N;
		while(true) {
			temp1 = O % 10; // 첫번째 자리
			temp2 = O / 10; // 두번째 자리
			temp3 = temp1+temp2;
			if(temp3 >= 10) {
				temp3 = temp3 % 10;				
			}
			result = Integer.toString(temp1) + Integer.toString(temp3);
			i++;
			
			if(Integer.valueOf(result) == N) break;
			
			O = Integer.valueOf(result);
		}
		System.out.println(i);
	}
}

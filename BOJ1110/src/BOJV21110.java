import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJV21110 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		if(N <10)
			N *= 10;	
				
		int i = 0;		
		int O = N;
		
		// (O % 10) * 10) -> 주어진 수의 첫번째 자리수가 십의자리로 이동하는 과정
		// ((O / 10) + (O % 10)) % 10 -> 주어진 수의 각 자리수의 합을 한 뒤 맨 오른쪽 수 구하기
		while(true) {
			O = ((O % 10) * 10) + (((O / 10) + (O % 10)) % 10);
			i++;
			if(N == O) break;			
		}
		System.out.println(i);
	}
}

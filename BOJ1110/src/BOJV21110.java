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
		
		// (O % 10) * 10) -> �־��� ���� ù��° �ڸ����� �����ڸ��� �̵��ϴ� ����
		// ((O / 10) + (O % 10)) % 10 -> �־��� ���� �� �ڸ����� ���� �� �� �� ������ �� ���ϱ�
		while(true) {
			O = ((O % 10) * 10) + (((O / 10) + (O % 10)) % 10);
			i++;
			if(N == O) break;			
		}
		System.out.println(i);
	}
}

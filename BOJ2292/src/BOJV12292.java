import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJV12292 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());

		int count = 1; 
		int j = 0; 
		if(N == 1) 
		{
			System.out.println(1);
		}
		else {
			for(int i = 2 ; i < N ; i++) {
				// ���δ� �������� ������ 6�� ����� �þ
				j++; // ����
				if(j % (6*count) == 0) {
					j = 0;
					count++;
				}
			}
			System.out.println(count+1);
		}
		
	}

}

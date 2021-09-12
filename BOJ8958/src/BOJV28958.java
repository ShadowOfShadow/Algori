import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJV28958 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < N ; i++) {
			int count = 0;
			int result = 0;
			
			// getBytes�޼ҵ�� �Է� ���ڿ��� byte������ �迭�� ��ȯ
			for(byte value : br.readLine().getBytes()) {
				
				if(value == 'O') {
					count++;
					result += count;
				}
				else {
					count = 0;
				}
			}
			sb.append(result).append('\n');
		}
		
		System.out.println(sb);
		
	}
}

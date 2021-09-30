import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1316 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int count = 0;
		
		label:for(int i = 0 ; i < N ; i++) {
			boolean[] check = new boolean[26];
			int prev = 0;
			String str = br.readLine();
			for(int j = 0 ; j < str.length() ; j++) {
				
				int now = str.charAt(j); // ���� ����
				
				// ���� �ʴٸ�
				if(prev != now) {
					
					// �ش� ���ڰ� ó�� ������ ���
					if(check[now - 'a'] == false) {
						check[now - 'a'] = true;
						prev = now;
					}
					// �ش� ���ڰ� ���Ծ��µ� �ٽ� �ѹ� ���� ��� -> �׷�ܾ� ���� ����
					else if(check[now - 'a'] == true) {
						continue label;
					}
					// �ش� ���ڰ� ���� �� �ִ� ���
					else {
						continue;
					}
				}
			}
			count++;
		}
		System.out.println(count);
	}
}

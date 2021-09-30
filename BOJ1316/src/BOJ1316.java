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
				
				int now = str.charAt(j); // 현재 문자
				
				// 같지 않다면
				if(prev != now) {
					
					// 해당 문자가 처음 나오는 경우
					if(check[now - 'a'] == false) {
						check[now - 'a'] = true;
						prev = now;
					}
					// 해당 문자가 나왔었는데 다시 한번 나온 경우 -> 그룹단어 조건 실패
					else if(check[now - 'a'] == true) {
						continue label;
					}
					// 해당 문자가 나온 적 있는 경우
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

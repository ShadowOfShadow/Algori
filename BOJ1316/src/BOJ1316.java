import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1316 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int count = 0;
		char overlap = 0;
		
		for(int i = 0 ; i < N ; i++) {
			String str = br.readLine();
			for(int j = 0 ; j < str.length() ; j++) {
				char ch = str.charAt(j);
				if(ch == str.charAt(j+1)) { // 연속된 것이 있다면 임시로 저장
					overlap = ch;
				}
				if(overlap != 0 && ch == overlap) {
					System.out.println("중복시작");
				}
				
				
			}
		}
		
	}
}

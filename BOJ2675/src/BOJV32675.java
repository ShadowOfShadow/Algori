import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJV32675 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < testCase ; i++) {
			
			String[] str = br.readLine().split(" ");
			
			int R = Integer.parseInt(str[0]);
			
			for(byte val : str[1].getBytes()) {
				for(int j = 0 ; j < R ; j++) {
					sb.append((char)val);
				}
			}
			sb.append('\n');
		}
		System.out.print(sb);
	}
}

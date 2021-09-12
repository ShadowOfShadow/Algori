import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJV18958 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		String[] OX = new String[N];
		
		
		int[] result = new int[N]; 
		
		// O => 79 , X = 88
		for(int i = 0 ; i < OX.length ; i++) {
			int count = 0;
			OX[i] = br.readLine();
			
			for(int j = 0 ; j < OX[i].length() ; j++) {
				if(OX[i].charAt(j) == 79) {
					count++;
				}
				else {
					count = 0;
				}
				result[i] += count;
			}
		}
		
		for(int k : result) {
			System.out.println(k);
		}
	}
}

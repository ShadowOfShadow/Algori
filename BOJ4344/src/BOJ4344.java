import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ4344 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for(int i = 0 ; i < T ; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			float count = 0;
			float sum = 0;
			float average = 0;
			
			int N = Integer.parseInt(st.nextToken());
			
			int[] result = new int[N]; // 학생수
			
			// 성적 입력
			for(int j = 0 ; j < N ; j++) { 
				result[j] = Integer.parseInt(st.nextToken());
				sum += result[j];
			}
			
			average = sum / N;
			
			for(int k = 0 ; k < N ; k++) {
				if(result[k] > average) {
					count++;
				}
			}
			
			System.out.printf("%.3f%%", (count / N)*100);
			System.out.println();
		}		
	}
}

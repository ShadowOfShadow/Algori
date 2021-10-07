import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1193 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int cross_count = 1, prev_count_sum = 0;
		
		while(true) {
			// 직진 대각선 누적합 + 해당 대각선 개수 이용한 범위 판별
			if(N <= prev_count_sum + cross_count) {
				// 대각선의 개수가 홀수라면
				if(cross_count %2 == 1) {
					// 분모가 큰 수부터 시작
					// 분모는 대각선 개수 - (N번째 - 직전 대각선까지의 누적합 - 1)
					// 분자는 N 번째 - 직전 대각선까지의 누적합
					System.out.print((cross_count - (N - prev_count_sum - 1)) + "/" + (N - prev_count_sum));
					break;
				}
				// 대각선의 개수가 짝수라면
				else {
					System.out.print((N - prev_count_sum) + "/" + (cross_count - (N - prev_count_sum - 1)));
					break;
				}
			}
			else {
				prev_count_sum += cross_count;
				cross_count++;
			}
			
		}
		
	}

}

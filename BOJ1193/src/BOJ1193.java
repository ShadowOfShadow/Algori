import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1193 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int cross_count = 1, prev_count_sum = 0;
		
		while(true) {
			// ���� �밢�� ������ + �ش� �밢�� ���� �̿��� ���� �Ǻ�
			if(N <= prev_count_sum + cross_count) {
				// �밢���� ������ Ȧ�����
				if(cross_count %2 == 1) {
					// �и� ū ������ ����
					// �и�� �밢�� ���� - (N��° - ���� �밢�������� ������ - 1)
					// ���ڴ� N ��° - ���� �밢�������� ������
					System.out.print((cross_count - (N - prev_count_sum - 1)) + "/" + (N - prev_count_sum));
					break;
				}
				// �밢���� ������ ¦�����
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

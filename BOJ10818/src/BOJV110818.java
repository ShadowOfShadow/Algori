import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJV110818 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		int[] number = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0 ; i < N ; i++) {
			number[i] = Integer.parseInt(st.nextToken());		
		}
		
		Arrays.sort(number);
		
		System.out.println(number[0] + " " + number[N-1]);
		
	}
}

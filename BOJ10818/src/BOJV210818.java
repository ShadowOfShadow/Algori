import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJV210818 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		int[] number = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		int i = 0;
		
		while(st.hasMoreTokens()) {
			number[i] = Integer.parseInt(st.nextToken());
			i++;
		}
		
		Arrays.sort(number);
		
		System.out.println(number[0] + " " + number[N-1]);
		
	}
}

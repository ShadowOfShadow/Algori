import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJV11546 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		
		float[] subject = new float[A];
		
		st = new StringTokenizer(br.readLine(), " ");
		
		int i = 0;
		float max = 0;
		float sum = 0;
		
		while(st.hasMoreTokens()) {
			subject[i] = Integer.parseInt(st.nextToken());
			if(subject[i] > max) {
				max = subject[i];
			}
			i++;
		}
		
		
		for(int j = 0 ; j < subject.length ; j++) {
			subject[j] = (subject[j]/max)*100;
			sum += subject[j];
		}
		
		System.out.println(sum/subject.length);
		
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJV11065 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int Num = Integer.parseInt(br.readLine());
		
		System.out.println(AP(Num));
		
	}

	private static int AP(int num) {
		int count = 0;
		
		for(int i = 1 ; i <= num ; i++) {
			if(i >= 1 && i <= 99) count++;
			else {
				int calc1 = i % 10;
				int calc2 = (i % 100) / 10;
				int calc3 = i / 100;
				if((calc3-calc2) == (calc2 - calc1)) count++;
			}
			
		}
		return count;
	}

}

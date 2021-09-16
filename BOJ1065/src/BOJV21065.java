import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJV21065 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String Num = br.readLine();
		
		System.out.println(AP(Num));
		
	}

	private static int AP(String num) {
		int count = 0;
		
		for(int i = 1 ; i <= Integer.parseInt(num) ; i++) {
			if(i >= 1 && i <= 99) count++;
			else {
				String j = Integer.toString(i);
				int calc1 = j.charAt(0) - '0';  
				int calc2 = j.charAt(1) - '0';
				int calc3 = j.charAt(2) - '0';
				if((calc3-calc2) == (calc2 - calc1)) count++;
			}
			
		}
		return count;
	}

}

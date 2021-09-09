import java.io.IOException;
import java.util.Scanner;

public class BOJV12577 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		String str = String.valueOf(A*B*C);
		
		scan.close();
		
		for(int i = 0 ; i < 10 ; i++) {
			int count = 0;
			for(int j = 0; j < str.length() ; j++) {
				if((str.charAt(j) - '0') == i) {
					count++;
				}
			}
			System.out.println(count);
		}
		
	}
}

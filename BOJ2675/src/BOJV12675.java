import java.util.Scanner;
import java.io.IOException;


public class BOJV12675 {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		
		int testCase = scan.nextInt();
		for(int i = 0 ; i < testCase ; i++) {
			
			int R = scan.nextInt();
			String S = scan.next();
			
			for(int j = 0 ; j < S.length() ; j++) { // 문자열자르고 반복횟수만큼 출력
				for(int k = 0 ; k < R ; k++) {
					System.out.print(S.charAt(j));
				}
			}
			System.out.println();
		}
	}
}

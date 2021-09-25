import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJV15622 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String Phone = br.readLine();
		
		int count = 0;
		
		for(int i = 0 ; i < Phone.length() ; i++) {
			if(Phone.charAt(i) - '0' == 1) {
				count += 2;
			}
			else if(Phone.charAt(i) == 'A' || Phone.charAt(i) == 'B' || Phone.charAt(i) == 'C') {
				count += 3;
			}
			else if(Phone.charAt(i) == 'D' || Phone.charAt(i) == 'E' || Phone.charAt(i) == 'F' ) {
				count += 4;
			}
			else if(Phone.charAt(i) == 'G' || Phone.charAt(i) == 'H' || Phone.charAt(i) == 'I') {
				count += 5;
			}
			else if(Phone.charAt(i) == 'J' || Phone.charAt(i) == 'K' || Phone.charAt(i) == 'L') {
				count += 6;				
			}
			else if(Phone.charAt(i) == 'M' || Phone.charAt(i) == 'N' || Phone.charAt(i) == 'O') {
				count += 7;
			}
			else if(Phone.charAt(i) == 'P' || Phone.charAt(i) == 'Q' || Phone.charAt(i) == 'R' || Phone.charAt(i) == 'S') {
				count += 8;
			}
			else if(Phone.charAt(i) == 'T' || Phone.charAt(i) == 'U' || Phone.charAt(i) == 'V') {
				count += 9;
			}
			else if(Phone.charAt(i) == 'W' || Phone.charAt(i) == 'X' || Phone.charAt(i) == 'Y' || Phone.charAt(i) == 'Z') {
				count += 10;
			}
			else {
				count += 11;
			}
		}
		
		System.out.println(count);
		
		
	}

}

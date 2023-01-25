import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		String[] b = new String[80];
		for(int i = 0 ; i < a ; i++) {
			b[i] = scanner.nextLine();
		}
		int score = 0;
		int score1 = 1;
		for( int i = 0 ; i  < 80;i++) {
			char[] c = b[i].toCharArray();
			if(c[i] == 'O') {
				score +=score1;
				while(c[i+1]==c[i]) {
					score1 +=1;
				}
			}
			System.out.println(score);
		}
		
	}
}
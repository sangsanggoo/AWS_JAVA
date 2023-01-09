package j07_반복문;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < 10 ; i++) {
			if(i % 2 != 0) {
				continue; //다음 반복을 실행 시켜라~ 
			}
			System.out.println("i : " + i);
		}
		int i = 0;
		while(i <  10) {
			if( i % 2 != 0) {
				i++;
				continue;
			}
			System.out.println("i : " + i);
			i++;
		}
	}

}

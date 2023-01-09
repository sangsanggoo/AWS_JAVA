package j05_캐스팅;

public class Casting3  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double kor=87.5;
		double eng=95.7;
		double math =80.5;
		int total = (int) (kor) + (int) eng + (int) math;
		double avg= (double) total / 3 ; //변수형이 다르면 연산X
		System.out.println(total);
		System.out.println(avg);
		double total2 = kor + eng + math;
		int avg2 = (int) (total2 / 3);
		System.out.println(total2);
		System.out.println(avg2);
		
		
	}
}

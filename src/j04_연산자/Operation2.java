package j04_연산자;

public class Operation2 {
	public static void main(String[] args) {
		int num=10;
		num = num+1;
		System.out.println(num++); //이거 이후에 1이 더해짐 
		System.out.println(num);
		System.out.println(++num); //1이 더해지고 실행
	}
}

package J17_스태틱;

public class CarMain {
	public static void main(String[] args) {
		Car[] car = new Car[5];
		car[0] = new Car("소나타");
		car[1] = new Car("그랜져");
		car[2] = new Car("K3");
		car[3] = new Car("자동차");
		car[4] = new Car("코끼리");
		
		for(int i = 0 ; i  < car.length;i++) {
			System.out.println(car[i]);
		}
	}
}	

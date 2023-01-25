package J13_상속;

public class ExtendsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KiaCar kiaCar = new KiaCar();
		kiaCar.setPrice(30000000);
		
		System.out.println(kiaCar);
		
		System.out.println(kiaCar.getPrice());
		System.out.println(kiaCar.discountPrice(20));
		
	}
	

}

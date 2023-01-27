package Three;


public class Main {
	public static void main(String[] args)  {
		Order order = null ;
		try {
			order.showOrderInfo(100, "Samsung GalaxyBook2", "홍길동", 1450000, 2);
		} catch (Exception e) {
			Order order2 = new Order();
			order2.showOrderInfo(100, "Samsung GalaxyBook2", "홍길동", 1450000, 2);
		} finally {
			
	}
		
		
	}
}

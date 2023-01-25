package J13_상속;

public class Car {
	private String company;
	private String mdoel;
	private int price;
	public Car() {
		// TODO Auto-generated constructor stub
		System.out.println("부모");
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getMdoel() {
		return mdoel;
	}
	public void setMdoel(String mdoel) {
		this.mdoel = mdoel;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int discountPrice(int percentage) {
		return price - (price * percentage / 100) ;
	}
}

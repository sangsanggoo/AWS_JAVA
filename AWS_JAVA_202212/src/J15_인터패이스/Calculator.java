package J15_인터패이스;

public interface Calculator {
	public int ERROR = -999999;
	public double plus(double x, double y);
	public double minus(double x ,double y);
	public default double multiplication(double x, double y) {
		return x *y;
	}
	
	public double division(double x, double y);
}

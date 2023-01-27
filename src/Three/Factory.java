package Three;



public class Factory {
	private String fatoryName;
	private static Factory instance = null;
	private Factory() {}
	public static Factory getInstance(){ //만들면서 유일한 하나의 객체를 생성
		if(instance == null) {
			instance = new Factory();
		}
		return instance;
}
}
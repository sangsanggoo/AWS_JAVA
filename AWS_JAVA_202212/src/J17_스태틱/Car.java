package J17_스태틱;

import java.time.LocalDateTime;

public class Car {
	
	private static final int NOW_YEAR = LocalDateTime.now().getYear();
	private static final String Code = "KIA-" + NOW_YEAR + "-"; //KIA-2023-
	private static int ai =1;
	private String modelName;
	private String carCode;
	public Car(String modelName) {
		this.modelName = modelName;
		carCode = Code + String.format("%04d", ai);
		ai++;
	}

	@Override
	public String toString() {
		return "Car [modelName=" + modelName  + "    Code = " + carCode+ "]";
	}
	
	
}

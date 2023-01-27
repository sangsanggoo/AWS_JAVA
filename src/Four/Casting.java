package Four;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program[] programs = new Program[2];
		programs[0] = new Java();
		programs[1] = new C();
		for(int i = 0 ; i < programs.length ; i++) {
			if(i == 0) {
				programs[i] = (Java) programs[i];
				programs[i].develop();
				programs[i].garbageCollection();
			} else {
				programs[i] = (C) programs[i];
				programs[i].develop();
				programs[i].defineStructure();
			}
				
	}

}
}
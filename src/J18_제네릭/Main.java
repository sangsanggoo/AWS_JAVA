package J18_제네릭;

public class Main {
	public static void main(String[] args) {
		TestData<String,Integer> td = new TestData<String,Integer>("김준일", 30);
//		TestData<? , ?> td = new TestData< >("김준일", 30);
//		머가 들어 올지 모를때 ?로 가능
		TestData<String,Double> td2 = new TestData<String,Double>("junil",100.05);
//		자료형을 바꾸고 싶을때 제네릭 사용
		System.out.println(td);
		System.out.println(td2);
		CMRespDto<TestData<String, Integer>> cm = 
		new CMRespDto<TestData<String, Integer>>(200,"성공", td);
		
		System.out.println(cm);
	}
}

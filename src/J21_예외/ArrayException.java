
package J21_예외;

import java.io.File;

public class ArrayException {
	public static void main(String[] args) {
		
		Integer[] nums = {1, 2, 3, 4, 5};
			File f = new File("C:/etst/");
			try {f.createNewFile();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			for(int i = 0 ; i < 6; i++) {
				System.out.println(nums[i]);
			}
//			RuntimeException에 자식클래스면
//			unchecked이고 실행은 되고 오류가 난다.
//		try {
			throw new NullPointerException(); // 예외 만들기
//		} catch (NullPointerException e) {
//		System.out.println("빈값 처리함"); //인덱스 초과 할경우 
//		} catch (IndexOutOfBoundsException e) {
//			System.out.println("예외 처리함"); //인덱스 초과 할경우 
//		} catch (Exception e) { // 마지막 예외
//			System.out.println("예상 못한 예외 처리함");
//		}
//		System.out.println("프로그램 정상 종료");
	}
}

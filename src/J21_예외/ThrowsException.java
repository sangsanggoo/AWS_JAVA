package J21_예외;

import java.util.Arrays;
import java.util.List;

public class ThrowsException { // throws exception : 예외처리를 해줘라 (예외를 미뤄주는 역할)
//	강제성을 주게 됨 
		public static void printList(List<String> list,int size) throws Exception {
			for(int i = 0 ; i< size ; i++) {
				System.out.println("[" + i + "]" + list.get(i));
			}
			System.out.println();
		}
		public static void main(String[] args) {
			String[] names = {"김수현" , "이종현" , "박성진" , "김동민"};
			try {
				throw new ClassCastException();
//				printList(Arrays.asList(names), 5);
			} catch (IndexOutOfBoundsException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally { // finally 예외처리가 되어도 실행 안되어도 실행
				System.out.println("무조건 실행");
			}

			System.out.println("프로그램 정상 종료");
			
		}
	}


package J21_예외;

public class ArrayException2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] nums = {1, 2, 3, 4, 5};
		for(int i  = 0 ; i < nums.length+1 ; i++) {
			System.out.println(nums[i]);
		}
	
	//이거는 실행이 되는 예외
		// TODO Auto-generated method stub
		Integer[] nums2 = {1, 2, 3, 4, 5};
		for(int i  = 0 ; i < nums.length+1 ; i++) {
			System.out.println(nums2[i])
		}
	}
	//이거는 실행이 안되는 예외
}
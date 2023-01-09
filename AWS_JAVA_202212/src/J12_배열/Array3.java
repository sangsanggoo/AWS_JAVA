package J12_배열;

import java.util.Random;

public class Array3  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Random random = new Random();
	int[] nums = new int[6];
	for(int i = 0 ; i < nums.length ; i++) {
		while(true) {
			boolean findFlag = true;
			
			int randomNum = random.nextInt(45) + 1;
			
			for(int j = 0 ; j < nums.length ; j++) {
				if(nums[j] == randomNum) {
				findFlag = false;
				break;
			}
			}
			if(findFlag) {
				nums[i] = randomNum;
				break;
			}
		}
	}
	
	
	for(int i  = 0 ; i < nums.length;i++) {
		System.out.print(nums[i] + " ");
	}
	
	}

}

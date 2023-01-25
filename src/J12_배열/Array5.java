package J12_배열;

public class Array5 {
	private static void transferArray(int[] oldArray, int[] newArray) { //새로운 배열에 전에 배열 데이터 넣기
		for(int i = 0 ; i < oldArray.length; i++) {
			newArray[i] = oldArray[i];
		}
	} 
	
	private static int[] addArrayLength (int[] array) { // 원래 배열 보다 길이가 1 큰 새로운 배열 만들기
		int [] newArray = new int[array.length + 1];
		transferArray(array,newArray);
		return newArray;
	} //위에 2개는 따로 호출할필요 없으니까 private로 은닉 시키는게 좋아
	
	public static int[] addData(int[] array, int data) { // 새로운 배열에 마지막자리에 데이터를 넣기
		int[] newArray = addArrayLength(array);
		newArray[array.length] = data;
		return newArray;
	}
	
	public static void main(String[] args) {
		int[] nums = new int[0];
		nums = addData(nums, 1);
		nums = addData(nums, 2);
		nums = addData(nums, 3);
		for(int i = 0; i < nums.length ; i++) {
			System.out.println(nums[i]);
		}
	}
}

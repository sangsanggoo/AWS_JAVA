package J26_쓰레드;

public class ThreadTest {
	public static void main(String[] args) {
		LoopThread loopThread1 = new LoopThread("일상현");
		LoopThread loopThread2 = new LoopThread("이상현");
		LoopThread loopThread3 = new LoopThread("삼상현");
		LoopThread loopThread4 = new LoopThread("사상현");
		loopThread1.setPriority(6);
		loopThread2.setPriority(5);
		loopThread3.setPriority(4);
		loopThread4.setPriority(3);
		System.out.println(loopThread1.getPriority()); // 우선순위는 숫자가 높으면 높은거임
		System.out.println(loopThread2.getPriority());
		System.out.println(loopThread3.getPriority());
		System.out.println(loopThread4.getPriority());
		
		loopThread1.start();
		loopThread2.start();
		loopThread3.start();
		loopThread4.start();
		
	}
}

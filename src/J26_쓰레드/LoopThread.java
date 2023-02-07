package J26_쓰레드;

public class LoopThread extends Thread {
	
	private String threadName;
	public LoopThread(String threadName) {
		this.threadName = threadName;
	}
	
	@Override
	public void run() {
			try {
				for(int i = 0 ; i< 10 ; i++) {
				System.out.println(threadName + ":" + i);
				Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}

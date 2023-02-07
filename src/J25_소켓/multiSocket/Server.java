package J25_소켓.multiSocket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private static final int PORT = 9090;
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(PORT); //서버가 하나 열림
			System.out.println("서버를 실행합니다.");
			while(true) {
				Socket socket = serverSocket.accept(); // 서버 접속을 기다림
				SocketServer socketServer = new SocketServer(socket); //
				socketServer.start(); //쓰레드 실행
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("서버를 종료합니다.");
		}
	}
}

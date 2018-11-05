package cn.ksb.minitxt.server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;

import cn.ksb.minitxt.common.entity.DataTransfer;
import cn.ksb.minitxt.common.entity.User;

public class ServerMain {

	/**
	 * 服务器入口方法
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new ServerMain().startServer();
	}

	public <E extends Serializable> void startServer() {
		try {
			ServerSocket serverSocket = new ServerSocket(Integer.parseInt(Init
					.getProperty("socket.server.port")));
			System.out.println("服务器启动成功！");
			
			while (true) {
				Socket socket = serverSocket.accept();
				System.out.println("客户端：" + socket.getInetAddress() + "获取了连接");

				ObjectInputStream in = new ObjectInputStream(
						socket.getInputStream());
				ObjectOutputStream out = new ObjectOutputStream(
						socket.getOutputStream());

				@SuppressWarnings("unchecked")
				DataTransfer<E> dataTransfer = (DataTransfer<E>) in
						.readObject();
				System.out.println("请求：" + dataTransfer.getKey());

				// Service<User> service = ServiceFactory.getService("login");
				Service<E> service = ServiceFactory.getService(dataTransfer
						.getKey());
				service.init(socket, in, out, dataTransfer.getData());
				new Thread(service).start();
			}

		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

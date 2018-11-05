package cn.ksb.minitxt.client;

import java.io.Serializable;

import cn.ksb.minitxt.common.constants.Constants;

public class ClientMain {

	/**
	 * �ͻ��������
	 */
	public static void main(String[] args) {
		new ClientMain().startClient();
	}

	public void startClient() {
		Service<? extends Serializable> service = ServiceFactory
				.getService(Constants.COMMAND_START);
		while (true) {
			if (service == null) {
				System.out.println("�˳�Ӧ�á�");
				break;
			}
			service = service.execute();
		}
	}

}

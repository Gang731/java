package cn.ksb.minitxt.services;

import java.io.Serializable;
import java.util.Scanner;

import cn.ksb.minitxt.client.BaseServiceImpl;
import cn.ksb.minitxt.client.Service;
import cn.ksb.minitxt.client.ServiceFactory;
import cn.ksb.minitxt.common.constants.Constants;

public class StartService extends BaseServiceImpl<Serializable> {
	private String OUTPUT_SIGN_LINE = "-------------------------------------\n";
	private String OUTPUT_TEXT_SELECT = "��ѡ�� ";
	private String OUTPUT_TEXT_TITLE = "��ӭʹ�� ����� ����TXTС˵�Ķ���\n";
	private String OUTPUT_TEXT_LOGIN = "1.��¼\n";
	private String OUTPUT_TEXT_REGISTER = "2.ע��\n";
	private String OUTPUT_TEXT_LOGOUT = "3.�˳�\n";
	private String OUTPUT_TEXT_THANK = "л л ʹ �ã�";
	private StringBuilder MENU_START = new StringBuilder(OUTPUT_TEXT_TITLE)
			.append(OUTPUT_SIGN_LINE).append(OUTPUT_TEXT_LOGIN)
			.append(OUTPUT_TEXT_REGISTER).append(OUTPUT_TEXT_LOGOUT)
			.append(OUTPUT_SIGN_LINE).append(OUTPUT_TEXT_SELECT);

	@Override
	public Service<? extends Serializable> execute() {
		System.out.println(MENU_START);
		Scanner scanner = new Scanner(System.in);
		String choice = null;
		while (true) {
			choice = scanner.nextLine().trim();
			switch (choice) {
			case "1":
				return ServiceFactory.getService(Constants.COMMAND_LOGIN);
			case "2":
				return ServiceFactory.getService(Constants.COMMAND_REGISTER);
			case "3":
				System.out.println(OUTPUT_TEXT_THANK);
				System.exit(0);
			default:
				System.out.println(OUTPUT_TEXT_INVALIDINPUT);
				break;
			}
		}
	}

}

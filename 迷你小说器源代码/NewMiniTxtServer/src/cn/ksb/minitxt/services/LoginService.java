package cn.ksb.minitxt.services;

import java.io.IOException;

import cn.ksb.minitxt.common.entity.DataTransfer;
import cn.ksb.minitxt.common.entity.User;
import cn.ksb.minitxt.server.BaseServiceImpl;
import cn.ksb.minitxt.utils.UserUtils;

public class LoginService extends BaseServiceImpl<User> {

	@Override
	public void execute() throws IOException {
		// TODO ��¼��صĴ���
		int result = UserUtils.doLogin(getData());
		// ��¼�ɹ�
		// 1. ��ѯС˵���࣬��Ϊ�������ݷ��ͻؿͻ���
		// 2. ����֮�󣬿ͻ������·������󣬻�ȡС˵����
		DataTransfer<?> dto = new DataTransfer<>();
		dto.setResult(result);
		getOut().writeObject(dto);
	}

}

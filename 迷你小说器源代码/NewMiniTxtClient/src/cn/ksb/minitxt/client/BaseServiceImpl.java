package cn.ksb.minitxt.client;

public abstract class BaseServiceImpl<T extends java.io.Serializable> implements Service<T> {
	protected String OUTPUT_TEXT_SERVERERROR = "���������ϣ������ԣ�";
	protected String OUTPUT_TEXT_ERROR = "ϵͳ���ڴ��󣬷�����ֹ��";
	protected String OUTPUT_TEXT_INVALIDINPUT = "��������������������룡";
	private T inputData;
	
	@Override
	public void setInputData(T inputData) {
		this.inputData = inputData;
	}
	
	public T getInputData() {
		return inputData;
	}

}

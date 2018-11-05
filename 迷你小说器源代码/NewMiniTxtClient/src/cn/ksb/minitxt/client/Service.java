package cn.ksb.minitxt.client;

public interface Service<T extends java.io.Serializable> {
	public void setInputData(T inputData);

	public Service<? extends java.io.Serializable> execute();
}

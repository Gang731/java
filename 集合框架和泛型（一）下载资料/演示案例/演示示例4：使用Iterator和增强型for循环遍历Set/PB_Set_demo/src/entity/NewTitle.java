package entity;

public class NewTitle {
	private int id;            //ID
	private String titleName;  //����
	private String creater;    //������
	public NewTitle() {
	}
	public NewTitle(int id, String titleName, String creater) {
		this.id = id;
		this.titleName = titleName;
		this.creater = creater;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitleName() {
		return titleName;
	}
	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}
	public String getCreater() {
		return creater;
	}
	public void setCreater(String creater) {
		this.creater = creater;
	}
	
}


public class Test {
	// 定义枚举
	public enum Level {
		L1,L2,L3
	}

	public void show(Level level) {
		switch (level) {
		case L1:
			System.out.println("大数据开发工程师");
			break;
		case L2:
			System.out.println("大数据挖掘工程师");
			break;
		case L3:
			System.out.println("大数据架构师");
			break;
		default:
			System.out.println("输入有错");
		}
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.show(Level.L1);
		Level level = Level.U2;
		t.show(level);
		t.show(Level.L3);
	}
}

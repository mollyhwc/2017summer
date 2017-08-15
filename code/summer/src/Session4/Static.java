package Session4;

public class Static {
	public int number;
	// static变量
	public static int tempture;
	String location;

	// static方法
	static void print() {
		// 调用static变量
		System.out.println(tempture);
		// 调用非静态变量
		//System.out.println(location);
	}
	
	public void addTemp(){
		tempture++;
	}
}

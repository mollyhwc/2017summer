package Session4;

public class Static {
	public int number;
	// static����
	public static int tempture;
	String location;

	// static����
	static void print() {
		// ����static����
		System.out.println(tempture);
		// ���÷Ǿ�̬����
		//System.out.println(location);
	}
	
	public void addTemp(){
		tempture++;
	}
}

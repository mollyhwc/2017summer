package Session5;

public class Tele {
	private float screen;
	private float cpu;
	private float mem;

	// ʹ��source��setter��getterֱ�ӵõ�set��get����
	public float getScreen() {
		return screen;
	}
	//this���������������Ͳ�����
	public void setScreen(float screen) {
		this.screen = screen;
	}

	public float getCpu() {
		return cpu;
	}

	public void setCpu(float cpu) {
		this.cpu = cpu;
	}

	public float getMem() {
		return mem;
	}

	public void setMem(float mem) {
		this.mem = mem;
	}
	public void print(){
		//this.method() ��ʾ���õ�ǰ���е�ĳ������
		this.sendMessage();
		//this��ʾ���󣬴�ӡthis��ʱ���Զ�����toString ����
		System.out.println(this);
	}
	public void sendMessage(){
		System.out.println("this telephone can send message");
	}
}

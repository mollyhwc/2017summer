package Session5;

public class Tele {
	private float screen;
	private float cpu;
	private float mem;

	// 使用source中setter和getter直接得到set和get函数
	public float getScreen() {
		return screen;
	}
	//this可以区分属性名和参数名
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
		//this.method() 表示调用当前类中的某个方法
		this.sendMessage();
		//this表示对象，打印this的时候自动调用toString 函数
		System.out.println(this);
	}
	public void sendMessage(){
		System.out.println("this telephone can send message");
	}
}

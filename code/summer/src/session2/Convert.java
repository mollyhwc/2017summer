package session2;

public class Convert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='e';
		//容量小的类型会默认转换为容量大的类型：byte->short->int->long->float->double
		//byte、short、char之间计算不会互相转换，首先转换成int再计算。
		int a=c;//char先转化成int 然后再赋值
		//byte a1=c;//相当于int 转化为byte
		//short a2=c;//相当于int转化short
		System.out.println(a);
		char d=(char)1000;
		double m=1.29e12;
		byte n=(byte)m;
		int cm = 9;
		cm<<=1;
		System.out.println(cm);
		System.out.printf("%cnihsoadao%e",  'c',m);
	}

}

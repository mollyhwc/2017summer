package session2;

public class Convert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='e';
		//����С�����ͻ�Ĭ��ת��Ϊ����������ͣ�byte->short->int->long->float->double
		//byte��short��char֮����㲻�ụ��ת��������ת����int�ټ��㡣
		int a=c;//char��ת����int Ȼ���ٸ�ֵ
		//byte a1=c;//�൱��int ת��Ϊbyte
		//short a2=c;//�൱��intת��short
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

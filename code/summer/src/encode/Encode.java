package encode;

public class Encode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="�Ұ�java";
		byte byte1[]=s.getBytes();
		for(byte b:byte1){
			//���ֽ�ת����int��16���Ʒ�ʽ��ʾ��
			//byte--int,���λǰ���24
			System.out.print(Integer.toHexString(b& 0xff)+" ");
			System.out.println(0x10&0xff);
		}
		
	}

}

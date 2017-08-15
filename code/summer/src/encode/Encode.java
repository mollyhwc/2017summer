package encode;

public class Encode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="我爱java";
		byte byte1[]=s.getBytes();
		for(byte b:byte1){
			//把字节转换成int以16进制方式显示，
			//byte--int,后八位前面加24
			System.out.print(Integer.toHexString(b& 0xff)+" ");
			System.out.println(0x10&0xff);
		}
		
	}

}

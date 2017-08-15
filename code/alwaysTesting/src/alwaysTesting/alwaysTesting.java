package alwaysTesting;

public class alwaysTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test printf()
		/**		
  		%c        单个字符 
        %d        十进制整数 
        %f        十进制浮点数 
        %o        八进制数 
        %s        字符串 
        %u        无符号十进制数 
        %x        十六进制数 
        %%        输出百分号%
        
        printf的格式控制的完整格式： 
		%  -  0  m.n  l或h  格式字符 
		下面对组成格式说明的各项加以说明： 
		%：表示格式说明的起始符号，不可缺少。 
		-：有-表示左对齐输出，如省略表示右对齐输出。 
		0：有0表示指定空位填0,如省略表示指定空位不填。 
		m.n：m指域宽，即对应的输出项在输出设备上所占的字符数。N指精度。用于说明输出的实型数的小数位数。为指定n时，隐含的精度为n=6位。 
		l或h:l对整型指long型，对实型指double型。h用于将整型的格式字符修正为short型。 
        **/
		
		System.out.printf("今天温度%d摄氏度\n",10);
		System.out.printf("今天温度%4d摄氏度\n",10);
		
		System.out.printf("今天温度%-4d摄氏度\n",10);
		System.out.printf("今天温度%-4f摄氏度\n",10.0);
	}

}

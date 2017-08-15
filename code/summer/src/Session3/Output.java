package Session3;

public class Output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Hello, world!\n");
		System.out.println("Hello, world!");
		//q:如果想printf换行怎么办？
		System.out.printf("%s", "abc");
		System.out.printf("今天温度%d摄氏度\n",10);
		System.out.printf("今天温度%4d摄氏度\n",10);	
		//下面这行有什么问题~
		System.out.printf("今天温度%-4d摄氏度\n",10);
		System.out.printf("今天温度%04d摄氏度\n",10);
		System.out.printf("今天温度%-4f摄氏度\n",10.0);
	}

}

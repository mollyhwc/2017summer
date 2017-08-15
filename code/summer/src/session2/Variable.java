package session2;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Java 中的变量需要先声明后使用
		//System.out.println(name);
		//变量使用时，可以声明变量的同时进行初始化
		int number1=4;
		//也可以先声明后赋值
		int number2;
		number2=3;
		//变量中每次只能赋一个值，但可以修改多次
		//int numberOfApple=4,5;
		int numberOfBanana=4;
		numberOfBanana=8;
		//main 方法中定义的变量必须先赋值，然后才能输出
		int height;
		//System.out.println(height);
		//虽然语法中没有提示错误，但在实际开发中，变量名不建议使用中文，容易产生安全隐患，譬如后期跨平台操作时出现乱码等等
		int 长度=23;
			
	}

}

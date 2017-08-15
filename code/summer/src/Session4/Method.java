package Session4;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(method2(3));
		//将返回值保存到变量中
		int variable =method2(4);
	}
	//void
	public static void method1(){
		System.out.println("this is method1");
		
	}
	//有返回值 
	public static int method2(int a){
		return a;
	}
	//下面的函数错在哪里？
	public static void method3(int b){
		//return b;
	}
	
}

package Session4;

public class VariableScope {
	//定义成员变量
	int variable;
	
	public void print1(){
		System.out.println(variable);
		//定义局部变量
		int a=1;
		
		int localVariable = 0;
		//在类内部使用局部变量
		System.out.println(localVariable);
	}
	
	public void print2(){
		int a=1;
		//在方法外部调用局部变量 
		//System.out.println(localVariable);
	}

}

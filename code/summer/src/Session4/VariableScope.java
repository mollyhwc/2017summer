package Session4;

public class VariableScope {
	//�����Ա����
	int variable;
	
	public void print1(){
		System.out.println(variable);
		//����ֲ�����
		int a=1;
		
		int localVariable = 0;
		//�����ڲ�ʹ�þֲ�����
		System.out.println(localVariable);
	}
	
	public void print2(){
		int a=1;
		//�ڷ����ⲿ���þֲ����� 
		//System.out.println(localVariable);
	}

}

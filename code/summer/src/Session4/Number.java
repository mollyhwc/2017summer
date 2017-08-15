package Session4;

public class Number {
	private int n1;
	private int n2;
	
	public Number(){
		n1 = 0;
		n2 = 1;
		
	}
	
	public Number(int n3, int n4){
		this.n1 = n3;
		this.n2 = n4;
	}
	public int addition(){
		System.out.println(n1+n2);
		return n1+n2;
	}
	public double multiplication(){
		System.out.println(n1*n2);
		return n1*n2;
	}
	public int substraction(){
		System.out.println(n1-n2);
		return n1-n2;
	}
	public double division(){
		System.out.println(n1/n2);
		return n1/n2;
	}
	public double division(int n1, int n2){
		System.out.println(n1/n2);
		return n1/n2;
	}

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}
}
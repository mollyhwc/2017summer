package student;

public class GradStudent extends Student {
	private int myGradID;

	public GradStudent() {
		myGradID = 0;
		System.out.println("gradstudent 默认的构造函数被执行");
	}

	// constructor
	public GradStudent(String name, int[] tests, String grade, int gradID) {
		super();
		myGradID = gradID;
		
		System.out.println("gradstudent 有参的构造函数被执行");

	}
	//新方法
	public int getID() {
		super.getGrade();
		return myGradID;
	}

}

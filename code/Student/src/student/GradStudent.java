package student;

public class GradStudent extends Student {
	private int myGradID;

	public GradStudent() {
		myGradID = 0;
		System.out.println("gradstudent Ĭ�ϵĹ��캯����ִ��");
	}

	// constructor
	public GradStudent(String name, int[] tests, String grade, int gradID) {
		super();
		myGradID = gradID;
		
		System.out.println("gradstudent �вεĹ��캯����ִ��");

	}
	//�·���
	public int getID() {
		super.getGrade();
		return myGradID;
	}

}

package student;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[];
		//System.out.println(b);
		int a[] = { 3, 3, 3 };
		// GradStudent grad1 = new GradStudent("22",a,"fail",9);
		// GradStudent grad2 = new GradStudent();

		// polymorphism
		 Student s = new Student();
		 Student u = new UnderGrad();
		 Student g = new GradStudent("22",a,"fail",9);
		 GradStudent h=new GradStudent();
		 System.out.println("---");
		 s.computeGrade();
		 u.computeGrade();
		 g.computeGrade();
		 System.out.println(g.getName());
		 System.out.println(s.getGrade());
		 System.out.println(u.getGrade());
		 System.out.println(g.getGrade());
		
//       父类不会继承子类的方法
		// s.getID();
		 g.computeGrade();
		 ((GradStudent)g).getID();
		
		 //Downcasting
//		 ((GradStudent)g).getID();
		 //(GradStudent)g.getID();
//
//		 Student s = new Student();
//		 Student i=s;
//		 Student g = new Student();
//		 System.out.println(s.equals(g));
//		 System.out.println(s==g);
//		 System.out.println(s.equals(i));
//		 System.out.println(s==i);
		
		
	}

}

package session6;


public abstract  class Circle extends Shape {
	private double radius;

	// constructor
	public Circle(double circleRadius, String circleName) {
		super(circleName);
		radius=circleRadius;
	}

	@Override
	public  void area(){
		super.area();
		System.out.println(radius*radius);
	}


	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		super.perimeter();
		System.out.println( 2 * Math.PI * radius);
	}
	

}

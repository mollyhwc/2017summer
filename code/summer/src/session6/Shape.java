package session6;

public  class Shape {
	private String name;
	// constructor
	public Shape(String shapeName) {
		name = shapeName;
		
	}

	public String getName() {
		return name;
	}

	public  void area(){
		System.out.println("this is area");
	}

	public  void perimeter(){
	System.out.println("this is perimeter");
	}

	private void privateMethod(){
		System.out.println("this is the private method");
	}
	
}

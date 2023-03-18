import java.lang.Math;

class AreaShape{
	public static void main(String args[]){
		Circle c1 = new Circle(50f);
		Triangle t1 = new Triangle(6f,4f);
		Rectangle r1 = new Rectangle(10f,20f);
		Square s1 = new Square(10f);
		System.out.println(c1.Area());
		System.out.println(t1.Area());
		System.out.println(r1.Area());
		System.out.println(s1.Area());
	}
}

class Circle{
	float radius;
	
	public Circle(float radius){
		this.radius = radius;
	}
	
	public float Area(){
		return (float)Math.PI * (float) Math.pow(this.radius, 2);
	}
}

class Triangle{
	float height;
	float base;
	public Triangle(float height, float base){
		 this.height = height;
		 this.base = base;
	 }
	 public float Area(){
		return 0.5f * ((float)this.base * (float)this.height);
	}
}
	
class Rectangle{
	float height;
	float base;
	
	public Rectangle(float height, float base){
		this.height = height;
		this.base = base;
	}
	
	public float Area(){
		return (this.base * this.height);
	}
}

class Square{
	float side;
	public Square(float side){
		this.side = side;
	}
	public float Area(){
		return (float) Math.pow(this.side,2);
	}
}

		
		
		

	 
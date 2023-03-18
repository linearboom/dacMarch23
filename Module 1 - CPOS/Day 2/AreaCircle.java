import java.lang.Math;

class AreaCircle{
	float radius;
	float area;
	
	public AreaCircle(float radius){
		this.radius = radius;
		this.area = (float) Math.PI * (float)Math.pow(this.radius,2);
	}
	
	public void Area(){
		System.out.println("The Area of the circle is " + this.area);
	}
	public static void main(String args[]){
		AreaCircle c1 = new AreaCircle(50);
		c1.Area();
	}
}
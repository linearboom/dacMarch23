class Actor{
	
	private String name;
	String FamousMovie;
	private int age;
	int NoMovies;
	int Awards;
	
	public Actor(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public static void main(String args[]){
		Actor a1 = new Actor("Shahrukkh", 60);
		Actor a2 = new Actor("Dream",52);
		a2.FamousMovie = "Famous Movie";
		System.out.println(a1.name  + a1. age);
		System.out.println(a2.name + a2.age +a2.FamousMovie);
	}
}
class Cake{
	
	String name;
	boolean fresh =true;
	boolean egg;
	String flavour;
	
	public void isFresh(){
		if(this.fresh){
			System.out.println(this.name +" Cake is Fresh");
		}else{
			System.out.println(this.name +" Cake is not Fresh");
		}
	}
	
	public static void main(String args[]){
		Cake c1 = new Cake();
		c1.name = "M";
		Cake c2 = new Cake();
		c2.name = "N";
		c1.isFresh();
		c2.isFresh();
		c1.fresh = false;
		c1.isFresh();
		c2.isFresh();
		System.out.println(c1.egg);
	}
}
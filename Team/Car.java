package Team;

  class Car extends Vehicle {
	 int y;
	 Car(){
		 super(10);
	 }
	 Car(int y){
		 super(y);
		 this.y=y;
	 }
	 public String toString() {
		 return super.x+":"+this.y;
	 }
	public static void main(String[] args) {
		Vehicle y= new Car(20);
		System.out.println(y);

	}

}

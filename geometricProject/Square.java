package geometricProject;

public class Square extends Shape {

	private double squarePremeter;
	private double squareSpace;
	
	Square(){
		
	}
	Square(double sideLength){
		super.setSideLength(sideLength);
		this.squareSpace=super.getSideLength()*super.getSideLength();
		this.squarePremeter=super.getSideLength()*4;
	}
	public double getSquarePremeter() {
		return squarePremeter;
	}
	public double getSquareSpace() {
		return squareSpace;
	}


	

}

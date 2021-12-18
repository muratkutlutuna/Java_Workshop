package geometricProject;

public class Square extends Parameters {

	private double premeter;
	private double space;
	
	Square(){
		
	}
	Square(double sideLength){
		super.setSideLength(sideLength);
		this.space=super.getSideLength()*super.getSideLength();
		this.premeter=super.getSideLength()*4;
	}
	
	public double getPremeter() {
		return premeter;
	}
	public double getSpace() {
		return space;
	}
	
}

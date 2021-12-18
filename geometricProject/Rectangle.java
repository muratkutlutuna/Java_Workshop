package geometricProject;

public class Rectangle extends Parameters {

	private double premeter;
	private double space;

	Rectangle(){
		
	}
	
	Rectangle(double sideLength, double LongSideLength){
		super.setSideLength(sideLength);
		super.setLongSideLength(LongSideLength);
		this.premeter=(super.getLongSideLength()*2)+(super.getSideLength()*2);
		this.space=(super.getLongSideLength()*super.getSideLength());
	}

	public double getPremeter() {
		return premeter;
	}

	public double getSpace() {
		return space;
	}

	
	
}

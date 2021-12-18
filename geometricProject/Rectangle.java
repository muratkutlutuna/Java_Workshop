package geometricProject;

public class Rectangle extends Shape {

	private double rectanglePremeter;
	private double rectangleSpace;

	public double getRectanglePremeter() {
		return rectanglePremeter;
	}

	public double getRectangleSpace() {
		return rectangleSpace;
	}

	Rectangle(){
		
	}
	
	Rectangle(double sideLength, double LongSideLength){
		super.setSideLength(sideLength);
		super.setLongSideLength(LongSideLength);
		this.rectanglePremeter=(super.getLongSideLength()*2)+(super.getSideLength()*2);
		this.rectangleSpace=(super.getLongSideLength()*super.getSideLength());
	}
	
}

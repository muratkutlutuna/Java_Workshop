package geometricProject;

public class Circle extends Parameters {

	private double space;
	private double premeter;

	Circle(){
		
	}
	Circle(double radius){
		super.setRadius(radius);
		this.premeter=super.getPi()*2*super.getRadius();
		this.space=super.getRadius()*super.getRadius()*super.getPi();
	}
	public double getSpace() {
		return space;
	}
	public double getPremeter() {
		return premeter;
	}
	
	
}

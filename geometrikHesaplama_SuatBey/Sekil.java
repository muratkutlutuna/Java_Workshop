package geometrikHesaplama_SuatBey;

public class Sekil {

	private double uzunKenar;
	private double kisaKenar;
	private double yariCap;
	private int kenar;
	
	
	public Sekil(double uzunKenar, double kisaKenar) {
		super();
		this.uzunKenar = uzunKenar;
		this.kisaKenar = kisaKenar;
	}
	
	public Sekil(int kenar) {
		super();
		this.kenar = kenar;
	}
	public Sekil(double yariCap) {
		super();
		this.yariCap=yariCap;
	}
	
public int alanHesabiKare() {
	return kenar*kenar;
}
public int cevreHesabiKare() {
	return kenar*4;
}
	

	public double alanHesabidikdortgen() {
		return uzunKenar*kisaKenar;
	}
	
	public double alanHesabiCember() {
		return yariCap*yariCap*3.14;
	}
	public double cevreHesabidikdortgen() {
		return (uzunKenar+kisaKenar)*2;
	}public double cevreHesabikare() {
		return uzunKenar*4;
	}
	public double cevreHesabiCember() {
		return 2*3.14*yariCap;
	}
}

package okulYonetimi;

public class Ogretmen extends Kisi {
	
	private String sicilNo;
	private String bolum;
	
	public Ogretmen() {
		
	}
	
	protected String getSicilNo() {
		return sicilNo;
	}

	protected void setSicilNo(String sicilNo) {
		this.sicilNo = sicilNo;
	}

	protected String getBolum() {
		return bolum;
	}

	protected void setBolum(String bolum) {
		this.bolum = bolum;
	}

	public Ogretmen(String sicilNo, String bolum, String adSoyad, String kimlikNo, int yas) {
		super(adSoyad, kimlikNo, yas);
		this.sicilNo = sicilNo;
		this.bolum = bolum;
	}
}

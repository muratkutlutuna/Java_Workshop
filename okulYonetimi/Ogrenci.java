package okulYonetimi;

public class Ogrenci extends Kisi{

	private String numara;
	private String sinif;
	
	public Ogrenci() {
		
	}
	
	public Ogrenci(String numara, String sinif, String adSoyad, String kimlikNo, int yas) {
		super(adSoyad, kimlikNo, yas);
		this.numara = numara;
		this.sinif = sinif;
	}
	protected String getNumara() {
		return numara;
	}
	protected void setNumara(String numara) {
		this.numara = numara;
	}
	protected String getSinif() {
		return sinif;
	}
	protected void setSinif(String sinif) {
		this.sinif = sinif;
	}

	

}

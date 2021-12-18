package okulYonetimi;

public class Kisi {
	protected String adSoyad;
	protected String kimlikNo;
	protected int yas;
	
	public Kisi() {
		
	}
	
	public Kisi(String adSoyad, String kimlikNo, int yas) {
		this.adSoyad = adSoyad;
		this.kimlikNo = kimlikNo;
		this.yas = yas;
	}
	protected String getAdSoyad() {
		return adSoyad;
	}
	protected void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}
	protected String getKimlikNo() {
		return kimlikNo;
	}
	protected void setKimlikNo(String kimlikNo) {
		this.kimlikNo = kimlikNo;
	}
	protected int getYas() {
		return yas;
	}
	protected void setYas(int yas) {
		this.yas = yas;
	}
}

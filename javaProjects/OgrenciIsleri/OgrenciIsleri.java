package javaProjects.OgrenciIsleri;

public class OgrenciIsleri {
	
	private int no; 
	private String adi; 
	private String soyadi;
	private double ortalama;
	
	protected int getNo() {
		return no;
	}

	protected void setNo(int no) {
		this.no = no;
	}

	protected String getAdi() {
		return adi;
	}

	protected void setAdi(String adi) {
		this.adi = adi;
	}

	protected String getSoyadi() {
		return soyadi;
	}

	protected void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	protected double getOrtalama() {
		return ortalama;
	}

	protected void setOrtalama(double ortalama) {
		this.ortalama = ortalama;
	}	
	
	public OgrenciIsleri() {
		
	}
	
	public OgrenciIsleri(int no, String adi, String soyadi, double ortalama) {
		super();
		this.no = no;
		this.adi = adi;
		this.soyadi = soyadi;
		this.ortalama = ortalama;
	}

	
	@Override
	public String toString() {
		return "OgrenciIsleri [no=" + no + ", adi=" + adi + ", soyadi=" + soyadi + ", ortalama=" + ortalama + "]";
	}
	
	

	

}

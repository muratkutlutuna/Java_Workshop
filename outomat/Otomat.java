package outomat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Otomat {

	private List<String> urun = new ArrayList<>(Arrays.asList("Cokonat", "Kitkat", "Ciklet", "Cizi", "Cips", "Bueno",
			"Oreo", "Cekirdek", "Sakiz", "Kakaolu Sut", "Gazoz", "Meyve Suyu", "Kahve", "Cay", "Su"));
	private List<Double> fiyat = new ArrayList<>(Arrays.asList(1.50, 1.00, 0.25, 0.75, 1.00, 1.25, 1.00, 0.50, 0.50, 2.00, 
															1.50, 2.50, 2.00, 0.15, 0.25));
	protected List<String> getUrun() {
		return urun;
	}
	protected void setUrun(List<String> urun) {
		this.urun = urun;
	}
	protected List<Double> getFiyat() {
		return fiyat;
	}
	protected void setFiyat(List<Double> fiyat) {
		this.fiyat = fiyat;
	}
	
	
	
}
package project_Library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LibraryDatabase {
	
	private List<Integer> bookNoList = new ArrayList<>(Arrays.asList(1001, 1002, 1003));
	private static int serialNo=1003;
	private List<String> bookList = new ArrayList<>(Arrays.asList("CALIKUSU", "FALAKA", "FARELER VE INSANLAR"));
	private List<String> authorList = new ArrayList<>(Arrays.asList("Resat Nuri Guntekin", "Ahmet Rasim", "John Steinback"));
	private List<String> pressList = new ArrayList<>(Arrays.asList("Vakit", "Bilge Kultur Sanat", "Sel Yayincilik"));
	private List<Double> priceList = new ArrayList<>(Arrays.asList(10.0,13.2,9.5));
	
	protected Integer getBookNo(String book) {
		return getBookNoList().get(getBookList().indexOf(book));
	}
	protected Integer getBookNo(int idxNo) {
		return getBookNoList().get(idxNo);
	}
	protected String getBook(int idxNo) {
		return getBookList().get(idxNo);
	}
	protected String getAuthor(int idxNo) {
		return getAuthorList().get(idxNo);
	}
	protected String getPress(int idxNo) {
		return getPressList().get(idxNo);
	}
	protected Double getPrice(int idxNo) {
		return getPriceList().get(idxNo);
	}
	protected List<String> getBookList() {
		return bookList;
	}
	protected List<Integer> getBookNoList(){
		return bookNoList;
	}
	protected List<String> getAuthorList() {
		return authorList;
	}
	protected List<String> getPressList() {
		return pressList;
	}
	protected List<Double> getPriceList() {
		return priceList;
	}
	protected void setBook(String book, String author, String press, double price) {
		this.bookList.add(book);
		this.authorList.add(author);
		this.pressList.add(press);
		this.priceList.add(price);
		this.bookNoList.add(serialNo+1);
		
	}
	
	protected void setRemoveBook(int no) {
		this.bookList.remove(getBookNoList().indexOf(no));
		this.authorList.remove(getBookNoList().indexOf(no));
		this.pressList.remove(getBookNoList().indexOf(no));
		this.priceList.remove(getBookNoList().indexOf(no));
		this.bookNoList.remove(getBookNoList().indexOf(no));
	}
	
	
}

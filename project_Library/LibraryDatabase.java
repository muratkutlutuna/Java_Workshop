package project_Library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LibraryDatabase {
	private List<Integer> bookNoList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12));
	private List<String> bookList = new ArrayList<>(Arrays.asList("CALIKUSU", "ISTANBUL'DA GEMILER", "FALAKA",
			"FARELER VE INSANLAR", "SEFILLER", "PINOKYO", "INSAN NE ILE YASAR?", "BEEYAZ GEMI", "FATIH HARBIYE",
			"MOR SALKIMLI EV", "YABAN", "SINEKLI BAKKAL"));
	protected Integer getBookNo(String book) {
		return getBookNoList().get(getBookList().indexOf(book));
	}
	protected String getBook(int no) {
		return getBookList().get(no-1);
	}
	protected List<String> getBookList() {
		return bookList;
	}
	protected List<Integer> getBookNoList(){
		return bookNoList;
	}
	protected void setBook(String book) {
		this.bookList.add(book);
		this.bookNoList.add(getBookNoList().size()+1);
	}
	protected void setRemoveBook(int no) {
		this.bookList.remove(no-1);
		this.bookNoList.remove(getBookNoList().size()-1);
	}
	
	
}

package interviewQuestions;

interface Exportable{
	void export();//void'in bas harfi kucuk olur
}

class Tool implements Exportable{
	public void export() {//public yapinca yandaki sonucu veriyor
		System.out.println("Tool::export");
	}
}

public class ReportTool extends Tool implements Exportable {

	public void export() {
		System.out.println("RTool::export");
	}
	
	public static void main(String[] args) {
		Tool aTool = new ReportTool();
		Tool bTool = new Tool();
		callExport(aTool);
		callExport(bTool);
	}

	public static void callExport (Exportable ex) {
		ex.export();
	}
}
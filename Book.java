package SPLab;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String name;
	private List<String> paragraphsList=new ArrayList<String>();
    private List<String> imagesList=new ArrayList<String>();
	private  List<String> tablesList=new ArrayList<String>();
	public Book(String name)
	{
		this.name=name;
	}

	public void createNewParagraph(String para) {
		this.paragraphsList.add(para);
	}

	public void createNewImage(String img) {
		this.imagesList.add(img);
	}

	public void createNewTable(String tab) {
		this.tablesList.add(tab);
	}

	public void print() {
		System.out.println("Nume "+this.name);
		System.out.println("Lista de paragrafe: " + this.paragraphsList);
		System.out.println("Lista de imagini: " + this.imagesList);
		System.out.println("Lista de tabele: " + this.tablesList);
		
	}
	
}

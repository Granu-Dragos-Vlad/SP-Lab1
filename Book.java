package SPBLab2;

import java.util.ArrayList;
import java.util.List;

public class Book {
	private String name;
	private Author a;
	private List<Chapter> chapters = new ArrayList<>();

	public Book(String num) {
		this.name = num;
	}

	public void addAuthor(Author b) {
		this.a = b;
	}

	public int createChapter(String b1) {
		Chapter b = new Chapter(b1);
		this.chapters.add(b);
		return this.chapters.size();
	}

	public Chapter getChapter(int index) {
		Chapter a = new Chapter();
		for (int i = 0; i < this.chapters.size(); ++i) {
			if (i == index) {
				return this.chapters.get(i);
			}
		}
		return a;

	}

}

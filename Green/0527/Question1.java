// 1번
// 책 클래스 (class Book)
// 필드(상태) : 제목(title), 저자(author)
// 메소드(기능) : 제목과 저자를 콘솔에 출력(printAll)

class Book {
	String title;
	String author;
	void printAll() {
		
		System.out.println(title + " 과 " + author);
	}
}

public class Question1 {
	public static void main(String[] args) {
		Book printBook = new Book();
		printBook.title = "제목";
		printBook.author = "저자";
		printBook.printAll();
	}
}
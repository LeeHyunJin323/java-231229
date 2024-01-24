package o_Chapter14.controller;
import java.util.List;
import o_Chapter14.model.Book;
import java.util.ArrayList;
// Book 데이터를 사용

public class BookController {

	//인스턴스 변수
	private List<Book> books;
	
	//생성자
	public BookController() {
		this.books = new ArrayList<Book>();
	}

	//책을 추가하는 기능
	public void addBook(String title, String author, String publisher) {
		Book newBook = new Book(title,author,publisher);
		books.add(newBook);
	}

	// 책을  리스트를 반환 하는 기능
	
	public List<Book> getAllBooks(){
		return books; // 전체 책 목록을 반환
	}
	
	//도서 검색 기능
	public List<Book> searchBook(String title){
		List<Book>result = new ArrayList<Book>();
		//books  배열의 요소를 처음부터 끝까지 순환
		// 각각의 순환마다 해당 요소를 Book 타입의 book 변수에 할당
		for(Book book : books) {
			if(book.getTitle().contains(title)) {
				result.add(book); // "개미"만 목록 작성 했을때 개미만 들어간 책을 다 담는다.
			}
		}
		return result;
	}
}

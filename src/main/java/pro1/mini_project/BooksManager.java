package pro1.mini_project;

import pro1.mini_project.books.Book;
import pro1.mini_project.books.BookType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BooksManager {
    private List<Book> books;

    public BooksManager() {
        books = createBooks();
    }

    public List<Book> findBooks() {
        return books;
    }


    public void addBook(String author, String title, BookType type) {
        books.add(new Book(author, title, type));
    }

    public boolean deleteBook(int bookId) {
        //czy jest książka o danym ID
        boolean result = false;
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).getId() == bookId) {
                books.remove(i);
                result = true;
                break;
            }
        }
        return result;
    }

    public List<Book> getSortedByAuthor() {
        Comparator<Book> booksComparatorByAuthor = Comparator.comparing(Book::getAuthor);
        Collections.sort(books, booksComparatorByAuthor);
        return books;
    }

    public List<Book> getSortedByType() {
        Comparator<Book> booksComparatorByType = Comparator.comparing(Book::getType);
        Collections.sort(books, booksComparatorByType);
        return books;
    }

    public List<Book> getSortedByTitle() {
        Comparator<Book> booksComparatorByTitle = Comparator.comparing(Book::getTitle);
        Collections.sort(books, booksComparatorByTitle);
        return books;
    }

    private List<Book> createBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Henryk Sienkiewicz", "Ogniem i mieczem", BookType.HISTORICAL));
        books.add(new Book("Juliusz Słowacki", "Balladyna", BookType.DRAMA));
        books.add(new Book("Agatha Cristie", "Morderstwo w Orient Expressie", BookType.DETECTIVE_STORY));
        books.add(new Book("Agatha Cristie", "Śmierć na Nilu", BookType.DETECTIVE_STORY));
        books.add(new Book("Juliusz Słowacki", "Oda do wolności", BookType.POETRY));
        books.add(new Book("Henryk Sienkiewicz", "Quo vadis", BookType.HISTORICAL));
        books.add(new Book("Norman Davies", "Boże igrzysko. Historia Polski", BookType.HISTORICAL));

        return books;
    }
}
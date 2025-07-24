package org.example.book_management_system.service;

/*

    내부 List로 도서 관리 (DB 없이 메모리 저장)
    BookNotFoundException을 통해 도서 없을 시 예외 처리
    updateBookAuthor(), deleteBook()에서 ID로 도서 검색 후 처리

 */

import org.example.book_management_system.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService {

    private List<Book> books = new ArrayList<>();

    @Override
    public void addBook(String title, String author) {
        books.add(new Book(title, author));
    }

    @Override
    public List<Book> getAllBook(String title, String author) {
        return books;
    }

    @Override
    public void updateBookAuthor(int id, String author) {

    }

    @Override
    public void FindId(int id) {

    }

    @Override
    public void deleteBook(int id) {

    }

    @Override
    public void findBookByTitle(String title) {

    }

}

package org.example.book_management_system.service;

/*

    도서 추가, 조회, 수정, 삭제, 검색 기능 메서드 정의

 */


import org.example.book_management_system.model.Book;

import java.util.List;

public interface BookService {

    public void addBook(String title, String author);

    public List<Book> getAllBook(String title, String author);

    public void updateBookAuthor(int id, String author);

    public void FindId(int id);

    public void deleteBook(int id);

    public void findBookByTitle(String title);




}

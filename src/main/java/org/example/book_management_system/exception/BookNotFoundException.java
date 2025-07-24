package org.example.book_management_system.exception;

/*

    RuntimeException 상속
    도서를 찾을 수 없을 때 커스텀 예외로 메시지 전달

 */

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException() {
        super();
    }
}

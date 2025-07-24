package org.example.book_management_system;

/*

    도서 등록, 전체 조회, 저자 수정, ID 조회, 삭제, 제목 검색 등 기능 수행
    try-catch로 예외 처리 흐름 학습

 */

import com.sun.source.tree.WhileLoopTree;
import org.example.book_management_system.service.BookServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookServiceImpl bookService = new BookServiceImpl();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("도서 관리 시스템");
            System.out.println("도서 등록");
            System.out.println("전체 조회");
            System.out.println("저자 수정");
            System.out.println("Id 조회");
            System.out.println("도서 삭제");
            System.out.println("제목 검색");
        }
    }
}

package org.example.book_management_system.model;

/*

    필드: id, title, author, createdAt, updatedAt
    생성자에서 DateUtil.now()를 사용하여 날짜 설정
    setAuthor 호출 시 updatedAt 갱신
    toString() 오버라이딩하여 출력 형식 정의

 */

import org.example.book_management_system.util.DateUtil;

public class Book {
    private int id;
    private String title;
    private String author;
    private String createdAt;
    private String updatedAt;

    public Book (String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.createdAt = DateUtil.now();
        this.updatedAt = DateUtil.now();
    }


    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getCreatedAt() { return createdAt; }
    public String getUpdatedAt() { return updatedAt; }

    public void setAuthor(String author) {
        this.author = author;
        this.updatedAt = DateUtil.now();
    }

    @Override
    public String toString() {
        return "ID" + id +
                " , Title: " + title +
                " , Author: " + author +
                " , createdAt: " + createdAt +
                " , updatedAt: " + updatedAt;
    }
}

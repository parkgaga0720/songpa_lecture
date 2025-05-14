package com.ohgiraffers.hw1.model.dto;

public class BookDTO {
    private int bNo;
    private int category;
    private String title;
    private String author;

    public BookDTO() {}

    public BookDTO(int category, String title, String author) {
        this.category = category;
        this.title = title;
        this.author = author;
    }

    public int getbNo() {
        return bNo;
    }

    public void setbNo(int bNo) {
        this.bNo = bNo;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        String cat = switch (category) {
            case 1 -> "인문";
            case 2 -> "자연과학";
            case 3 -> "의료";
            case 4 -> "기타";
            default -> "미분류";
        };
        return String.format("도서번호: %d | 분류: %s | 제목: %s | 저자: %s", bNo, cat, title, author);
    }
}

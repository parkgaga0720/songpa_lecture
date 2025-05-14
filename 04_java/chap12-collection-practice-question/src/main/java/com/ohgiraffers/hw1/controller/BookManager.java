package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.dto.BookDTO;
import com.ohgiraffers.hw1.model.comparator.AscCategory;
import com.ohgiraffers.hw1.model.comparator.DescCategory;

import java.util.*;

public class BookManager {
    private ArrayList<BookDTO> bookList;

    public BookManager() {
        bookList = new ArrayList<>();
    }

    public void addBook(BookDTO book) {
        book.setbNo(bookList.size() + 1);
        bookList.add(book);
    }


    public void deleteBook(int index) {
        if (index >= 0 && index < bookList.size()) {
            bookList.remove(index);
        }
    }

    public int searchBook(String title) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getTitle().equals(title)) {
                return i;
            }
        }
        return -1;
    }

    public void printBook(int index) {
        if (index >= 0 && index < bookList.size()) {
            System.out.println(bookList.get(index));
        }
    }

    public void displayAll() {
        if (bookList.isEmpty()) {
            System.out.println("출력할 도서가 없습니다.");
        } else {
            for (BookDTO book : bookList) {
                System.out.println(book);
            }
        }
    }

    public ArrayList<BookDTO> sortedBookList(int select) {
        ArrayList<BookDTO> sorted = new ArrayList<>(bookList);
        if (select == 1) {
            Collections.sort(sorted, new AscCategory());
        } else if (select == 2) {
            Collections.sort(sorted, new DescCategory());
        }
        return sorted;
    }

    public void printBookList(ArrayList<BookDTO> br) {
        for (BookDTO book : br) {
            System.out.println(book);
        }
    }
}

package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {
    private Scanner sc = new Scanner(System.in);
    private BookManager bm = new BookManager();

    public BookMenu() {}

    public void menu() {
        while (true) {
            System.out.println("*** 도서 관리 프로그램 ***");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서정보 정렬 후 출력");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 검색출력");
            System.out.println("5. 전체 출력");
            System.out.println("6. 끝내기");
            System.out.print("메뉴 번호 선택 : ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> bm.addBook(inputBook());
                case 2 -> {
                    System.out.print("정렬 방식을 선택해주세요 (1. 오름차순, 2. 내림차순): ");
                    int sortType = sc.nextInt();
                    sc.nextLine();
                    if (sortType != 1 && sortType != 2) {
                        System.out.println("번호를 잘못입력하였습니다.");
                    } else {
                        ArrayList<BookDTO> sorted = bm.sortedBookList(sortType);
                        bm.printBookList(sorted);
                    }
                }
                case 3 -> {
                    System.out.print("삭제할 도서 제목: ");
                    String title = sc.nextLine();
                    int idx = bm.searchBook(title);
                    if (idx != -1) {
                        bm.deleteBook(idx);
                        System.out.println("성공적으로 삭제되었습니다.");
                    } else {
                        System.out.println("삭제할 글이 존재하지 않습니다.");
                    }
                }
                case 4 -> {
                    int index = bm.searchBook(inputBookTitle());
                    if (index == -1) {
                        System.out.println("조회한 도서가 존재하지 않습니다.");
                    } else {
                        bm.printBook(index);
                    }
                }
                case 5 -> bm.displayAll();
                case 6 -> {
                    System.out.println("프로그램을 종료합니다.");
                    return;
                }
                default -> System.out.println("올바른 번호를 입력해주세요.");
            }
        }
    }

    public BookDTO inputBook() {
        System.out.print("도서 제목: ");
        String title = sc.nextLine();
        System.out.print("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타): ");
        int category = sc.nextInt();
        sc.nextLine();
        System.out.print("도서 저자: ");
        String author = sc.nextLine();
        return new BookDTO(category, title, author);
    }

    public String inputBookTitle() {
        System.out.print("도서 제목: ");
        return sc.nextLine();
    }
}

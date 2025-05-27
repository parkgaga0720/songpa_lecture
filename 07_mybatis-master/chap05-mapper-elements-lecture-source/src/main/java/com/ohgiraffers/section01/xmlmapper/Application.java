package com.ohgiraffers.section01.xmlmapper;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("mapper element test menu");
            System.out.println("1. resultmap");
            System.out.println("2. sql");
            System.out.println("번호 입력 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1: resultMapSubMenu(); break;
                case 2:

            }
        } while(true);
    }
    private static void resultMapSubMenu() {
        Scanner sc = new Scanner(System.in);
        ElementTestService elementTestSetvie = new ElementTestService();
        do {
            System.out.println("sub menu");
            System.out.println("1. resultmap");
            System.out.println("2. constructor");
            System.out.println("3. association");
            System.out.println("4. collection");
            System.out.println("번호 입력 : ");
            int no = sc.nextInt();
            switch (no) {
                case 1:
            }
        } while (true);
    }
}

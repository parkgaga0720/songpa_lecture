package com.ohgiraffers.hw1.model.comparator;

import com.ohgiraffers.hw1.model.dto.BookDTO;
import java.util.Comparator;

public class AscCategory implements Comparator<BookDTO> {
    @Override
    public int compare(BookDTO b1, BookDTO b2) {
        return Integer.compare(b1.getCategory(), b2.getCategory());
    }
}

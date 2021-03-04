package main.java;

import java.util.*;

public class Reader {

    Book choiceBook(Book list[]){
        return list[new Random().nextInt(list.length - 1)];
    }

    void readBook(Book book){
        System.out.println("Я книжку прочитала!");
        System.out.println(book.toString());
    }

    void rateBook(Book book){
        int rate = book.getTitleLength() + book.getWriterLength() - book.getSerialNumber() + book.getNumberOfPages();
        System.out.println("Как мне книга \"" + book.title + "\"?");
        System.out.println("Моя оценка: " + rate);
    }

}

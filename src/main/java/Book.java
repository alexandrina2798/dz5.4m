package main.java;

import java.util.Random;

public class Book {
    String title;
    String writer;
    int serialNumber;
    int numberOfPages;

    public Book(String title){
        this.title = title;
        this.writer = "";
    }

    public Book(String title, String writer){
        this.title = title;
        this.writer = writer;
    }

    public Book(String title, String writer, int serialNumber){
        this.title = title;
        this.writer = writer;
        this.serialNumber = serialNumber;
    }

    public Book(String title, String writer, int serialNumber, int numberOfPages){
        this.title = title;
        this.writer = writer;
        this.serialNumber = serialNumber;
        this.numberOfPages = numberOfPages;
    }

    public int getTitleLength(){
        int result;
        if (this.title.length() > 0){
            result = this.title.length();
        }
        else {
            result = - new Random().nextInt(); //чтобы вычесть рандомное число из оценки
        }
        return result;
    }

    public int getWriterLength() {
        int result;
        if (this.writer.length() > 0){
            result = this.writer.length();
        }
        else {
            result = - new Random().nextInt(); //чтобы вычесть рандомное число из оценки
        }
        return result;
    }

    public int getSerialNumber() {
        int result;
        if (this.serialNumber > 0){
            result = this.serialNumber;
        }
        else {
            result = new Random().nextInt();
        }
        return result;
    }

    public int getNumberOfPages() {
        int result;
        if (this.numberOfPages > 0){
            result = this.numberOfPages;
        }
        else {
            result = - new Random().nextInt();
        }
        return result;
    }

    @Override
    public String toString() {
        String result = "Название книги: " + this.title + ", ";

        if (this.writer.isEmpty()) {
            result = result + "Автор мне неизвестен, ";
        }
        else {
            result = result + "Автор: " + this.writer + ", ";
        }

        if (this.serialNumber == 0){
            result = result + "Порядковый номер книги в серии мне неизвестен";
        }
        else {
            result = result + "Порядковый номер книги: " + this.serialNumber;
        }

        if (this.numberOfPages == 0){
            result = result + ", Количество страниц мне неизвестно.";
        }
        else {
            result = result + ", Количество страниц: " + this.numberOfPages + ".";
        }

        return result;
    }


}

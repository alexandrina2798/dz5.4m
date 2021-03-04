package main.java;

public class Main {

    public static void main(String[] args) {
	    //книги на выбор
        Book book0 = new Book("Гордость и предубеждение");
        Book book1 = new Book("Снафф", "Чак Палланик", 1);
        Book book2 = new Book("Дзен и искусство ухода за мотоциклом", "Роберт Пёрсиг", 1, 478);
        Book book3 = new Book("Скотный двор", "Джорж Оруэлл", 1, 120);
        Book book4 = new Book("Американские боги", "Нил Гейман", 1, 639);
        Book book5 = new Book("Гарри Поттер и Орден Феникса", "Джоан К. Роулинг", 5);
        Book book6 = new Book("1984", "Джордж Оруэлл", 1, 328);
        Book book7 = new Book("Библия");

        //сохраняем в массив
        Book[] bookList = new Book[] {book0, book1, book2, book3, book4, book5, book6, book7};

        Reader asya = new Reader();

        Book book = asya.choiceBook(bookList);
        asya.readBook(book);
        asya.rateBook(book);

    }
}

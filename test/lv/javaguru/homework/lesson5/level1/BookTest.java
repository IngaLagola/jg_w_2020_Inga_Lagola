package lv.javaguru.homework.lesson5.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest{

    //šeit principā šī metode notestē gan get, gan set funkcionalitāti
    @Test
    void shouldSetAuthor() {
        Book book = new Book();
        book.setAuthor("lulu");
        assertEquals("lulu", book.getAuthor());
    }

    //atkārtot nav nepiciešams
    @Test
    void shouldGetAuthor() {
        Book book = new Book();
        assertEquals(null, book.getAuthor());
    }

    @Test
    void shouldSetTitle() {
        Book book = new Book();
        book.setTitle("Emi");
        assertEquals("Emi", book.getTitle());
    }

    @Test
    void shouldGetTitle() {
        Book book = new Book();
        assertEquals(null, book.getTitle());
    }

    @Test
    void shouldSetPageCount() {
        Book book = new Book();
        book.setPageCount(100);

        assertEquals(100, book.getPageCount());
    }

    @Test
    void shouldGetPageCount() {
        Book book = new Book();
        //neatstāj aizkomentētu kodu
        //   System.out.println(book.getPageCount());
        assertEquals(0, book.getPageCount());
    }

    @Test
    void shouldCheckToString() {
        Book book = new Book();
        String author = "lulu";
        String title = "Emi";
        int pageCount = 100;
        String testString = "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", pageCount='" + pageCount + '\'' +
                '}';
        book.setAuthor(author);
        book.setTitle(title);
        book.setPageCount(pageCount);
        assertEquals(testString, book.toString());
    }

    //testa nosaukumam ir jāapraksta test būtība
    //šeit testam labaks nosaukums būs: shouldBooksBeEquals
    @Test
    void shouldReturnTrueWhenObjectsAreEqual() {
        String author = "lulu";
        String title = "Emi";
        int pageCount = 100;

        Book firstBook = new Book();
        Book secondBook = new Book();

        firstBook.setAuthor(author);
        firstBook.setTitle(title);
        firstBook.setPageCount(pageCount);

        secondBook.setAuthor(author);
        secondBook.setTitle(title);
        secondBook.setPageCount(pageCount);

        assertEquals(true, firstBook.equals(secondBook));
    }

    //testa nosaukumam ir jāapraksta test būtība
    //šeit testam labaks nosaukums būs: shouldBooksNotBeEquals
    @Test
    void shouldReturnFalseWhenObjectsAreNotEqual() {
        String author = "lulu";
        String title = "Emi";
        int pageCount = 100;

        Book firstBook = new Book();
        Book secondBook = new Book();

        firstBook.setAuthor(author);
        firstBook.setTitle(title);
        firstBook.setPageCount(pageCount);

        secondBook.setAuthor("kkkk");
        secondBook.setTitle(title);
        secondBook.setPageCount(pageCount);

        assertEquals(false, firstBook.equals(secondBook));
    }
}
package lv.javaguru.homework.lesson5.level1;

import java.util.Objects;

public class Book{

    private String author;
    private String title;
    private int pageCount;

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public String toString(){
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", pageCount='" + pageCount + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object that){
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Book book = (Book) that;
        return Objects.equals(author, book.author) &&
                Objects.equals(title, book.title) &&
                pageCount == book.pageCount;
    }


}

package _03_Iterators_and_Comparators_Lab._02_Library;

import java.util.Arrays;
import java.util.List;

public class Book {
    private String title;
    private int year;
    private List<String> authorsss;

    public Book(String title, int year, String... authors) {
        this.setTitle(title);
        this.setYear(year);
        this.setAuthors(authors);
    }

    public String getTitle() {
        return this.title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return this.year;
    }

    private void setYear(int year) {
        this.year = year;
    }

    public List<String> getAuthors() {
        return this.authorsss;
    }

    private void setAuthors(String... authors) {
        this.authorsss = Arrays.asList(authors);
    }
}

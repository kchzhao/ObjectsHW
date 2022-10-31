public class Book {
    private String name;
    private Author author;
    private int year;

    public Book(String name, Author author, int year){
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName(){
        return name;
    }

    public Author getAuthorName(){
        return author;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    @Override
    public String toString() {
        String bookName = "Book name: " + name + ",";
        String authorName = " Author: " + author.getFirstName() + " " + author.getLastName() + ",";
        String datePublished = " Published: " + year;
        return bookName + authorName + datePublished;
    }
}

public class Book {
    String name;
    String authorName;
    int year;

    public Book(String newName, String newAuthorName, int newYear){
        name = newName;
        authorName = newAuthorName;
        year = newYear;
    }

    public String getName(){
        return name;
    }

    public String getAuthorName(){
        return authorName;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int newYear){
        year = newYear;
    }

}

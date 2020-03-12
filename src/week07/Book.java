package week07;

public class Book {
    private String title, author, year, publisher;

    Book(String title, String author, String year, String publisher){
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
    }

    public String getBookInfo(){
        return this.author + ". " + this.year + ". " + this.title + ". " + this.publisher + ".";
    }

}

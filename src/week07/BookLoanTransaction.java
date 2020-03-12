package week07;

import java.util.ArrayList;

public class BookLoanTransaction {
    private ArrayList<Book> books = new ArrayList<Book>();
    private Member member;
    private String booksTxt;

    BookLoanTransaction(Member member) {
        this.member = member;
    }

    public String getTrxInfo(){
        for(Book b: books){
            booksTxt = "\t\t" + b.getBookInfo() + "\n";
        }
        return member.getMemberInfo() + "\n" + booksTxt;
    }

    public String addBook(Book book) {
        if(books.size() >= 3){
            return "Member already has 3 books.";
        }else{
            books.add(book);
            return "Book added to Transaction";
        }
    }
}

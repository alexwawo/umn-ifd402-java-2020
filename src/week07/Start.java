package week07;

import java.util.ArrayList;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        Boolean exit = false, userExist = false, logout = false;
        String again = "n";
        Scanner in = new Scanner(System.in);
        String username, password, name, title, author, year, publisher, email, phone, choose;
        int n, chooseInt, userIndex;

        User user = new User();

        ArrayList<User> users = new ArrayList<User>();
        ArrayList<Book> books = new ArrayList<Book>();
        ArrayList<Member> members = new ArrayList<Member>();
        ArrayList<BookLoanTransaction> blTrxs = new ArrayList<BookLoanTransaction>();

        // Generate LibraryHead
        User mrJohnThor = new User("John Thor", "johnthor", "rahasia");
        mrJohnThor.setAsHead();

        // Add John Thor to User List
        users.add(mrJohnThor);

        for(User u : users){
            System.out.println(u.getUsername());
        }

        do{
            // Login START
            do{
                // Login
                System.out.println("Simple Library Management Program");
                System.out.println("=================================");
                System.out.println("Login:");
                System.out.print("Username: ");
                username = in.nextLine();
                System.out.println("username: " + username);
                System.out.print("Password: ");
                password = in.nextLine();
                System.out.println("password: " + password);

                // search username & password
                for(User u: users){
                    if(u.login(username, password)){
                        userExist = true;
                        user = u;
                        break;
                    }
                }
                if(userExist) break;
                System.out.println("Username or password invalid. Please try again.");
            }while(!userExist);
            // Login END
            System.out.println("role" + user.getUsername());
            switch(user.getRole()){
                case "head":
                    do{
                        System.out.println("Program Main Menu - Library Head");
                        System.out.println("1. Add New Staff");
                        System.out.println("2. View Staff List");
                        System.out.println("3. View Reports");
                        System.out.println("4. Logout");
                        System.out.print("Choose [1/2/3/4]: ");
                        choose = in.nextLine();

                        switch(choose){
                            case "1": // Add New Staff
                                System.out.println("Add New Staff");
                                System.out.print("Name \t: ");
                                name = in.nextLine();
                                System.out.print("Username \t: ");
                                username = in.nextLine();
                                System.out.print("Password \t: ");
                                password = in.nextLine();
                                User staff = new User(name, username, password);
                                users.add(staff);
                                break;
                            case "2": // View Staff List
                                System.out.println("View Staff List");
                                System.out.println("Name \t\t\t Username \t\t\t Password");
                                for(User u : users) {
                                    System.out.println(u.getName() + " \t\t\t " + u.getUsername() + " \t\t\t " + u.getPassword());
                                }
                                break;
                            case "3": // View Reports
                                break;
                            case "4": // Logout
                                logout = true;
                                break;
                            default:
                        }
                    }while(!logout);
                    break;
                case "staff":
                    do{
                        System.out.println("Program Main Menu - Library Staff");
                        System.out.println("1. Add New Book");
                        System.out.println("2. View Book List");
                        System.out.println("3. Add New Member");
                        System.out.println("4. View Member List");
                        System.out.println("5. Create Loan Transaction");
                        System.out.println("6. View Loan Transaction List");
                        System.out.println("7. Logout");
                        System.out.print("Choose [1-7]: ");
                        choose = in.nextLine();

                        switch(choose){
                            case "1": // Add New Book
                                System.out.println("Add New Book");
                                System.out.println("Book Title: ");
                                title = in.nextLine();
                                System.out.println("Author: ");
                                author = in.nextLine();
                                System.out.println("Year: ");
                                year = in.nextLine();
                                System.out.println("Publisher: ");
                                publisher = in.nextLine();
                                Book book = new Book(title, author, year, publisher);
                                books.add(book);
                                break;
                            case "2": // View Book List
                                System.out.println("View Book List");
                                n = 1;
                                for(Book b : books) {
                                    System.out.println(n + ". " + b.getBookInfo());
                                    n++;
                                }
                                break;
                            case "3": // Add New Member
                                System.out.println("Add New Member");
                                System.out.println("Member Name: ");
                                name = in.nextLine();
                                System.out.println("Email: ");
                                email = in.nextLine();
                                System.out.println("Phone: ");
                                phone = in.nextLine();
                                Member member = new Member(name, email, phone);
                                members.add(member);
                                break;
                            case "4": // View Member List
                                System.out.println("View Member List");
                                n = 1;
                                for(Member m : members) {
                                    System.out.println(n + ". " + m.getMemberInfo());
                                    n++;
                                }
                                break;
                            case "5": // Create Book Loan Transaction
                                System.out.println("Create Book Loan Transaction");
                                System.out.println("Select Member:");
                                n = 1;
                                for(Member m : members){
                                    System.out.println(n + ". " + m.getMemberInfo());
                                    n++;
                                }
                                System.out.println("Choose: ");
                                chooseInt = in.nextInt();
                                chooseInt -= 1;
                                BookLoanTransaction blTrx = new BookLoanTransaction(members.get(chooseInt));
                                do{
                                    System.out.println("Chooose Book To Borrow: ");
                                    n = 1;
                                    for(Book b : books){
                                        System.out.println(n + ". " + b.getBookInfo());
                                        n++;
                                    }
                                    System.out.print("Choose: ");
                                    chooseInt = in.nextInt();
                                    chooseInt -= 1;
                                    blTrx.addBook(books.get(chooseInt));
                                    System.out.print("Borrow more book? [y/n]: ");
                                    again = in.nextLine();
                                }while(again == "y" || again == "Y");
                                blTrxs.add(blTrx);
                                break;
                            case "6": // View Book Loan Transaction List
                                System.out.println("View Book Loan Transaction");
                                n = 1;
                                for(BookLoanTransaction blT: blTrxs){
                                    System.out.println(n + ". " + blT.getTrxInfo());
                                }
                            case "7": // Logout
                                logout = true;
                                break;
                            default:
                        }
                    }while(!logout);
            }
        }while(true);
    }
}

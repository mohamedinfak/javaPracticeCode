abstract class Book {
    String title;
    int year;

    Book(String b_name, int yr) {
        title = b_name;
        year = yr;
    }

    abstract void showDetails();
}

class PhoneBook extends Book {
    String location;
    String type;

    PhoneBook(String b_name, int yr, String loc, String typ) {
        super(b_name, yr);
        location = loc;
        type = typ;
    }

    void showDetails() {
        System.out.println("The name of the book: " + title);
        System.out.println("The year of publication: " + year);
        System.out.println("The location: " + location);
        System.out.println("The type: " + type);
    }
}

class Novel extends Book {
    String style;
    String language;
    String author;

    Novel(String b_name, int yr, String st, String lang, String aut) {
        super(b_name, yr);
        style = st;
        language = lang;
        author = aut;
    }

    void showDetails() {
        System.out.println("The name of the book: " + title);
        System.out.println("The year of publication: " + year);
        System.out.println("The style: " + style);
        System.out.println("The language: " + language);
        System.out.println("The author: " + author);
    }
}

public class Library {
    public static void main(String args[]) {
        Book ph_book = new PhoneBook("Tata", 1991, "Delhi", "Business");
        ph_book.showDetails();
        System.out.println("\n");
        Book nov_book = new Novel("Anna", 1878, "Psycological", "English", "Toy");
        nov_book.showDetails();
    }
}

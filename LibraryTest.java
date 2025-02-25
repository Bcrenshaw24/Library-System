import java.util.ArrayList;

public class LibraryTest { 

    public static void main(String[] args) { 
        addTest(); 
       // removeTest();
        //checkTest(); 
        //isbnTest(); 
        //titleTest(); 
        //filterA();
        

    
    } 

    public static void addTest() {  
        Library library = new Library(); 

        Book book1 = new Book("The Grace Year", "Kim Ligget", 1, true);
        Book book2= new Book("Diary of a Wimpy Kid", "Jeff Kinney", 2, true);

        library.addBook(book1);
        library.addBook(book2);  

       library.displayBooks();

    } 
    public static void removeTest() {  
        Library library = new Library();  

        Book book1 = new Book("The Grace Year", "Kim Ligget", 1, true);
        Book book2= new Book("Diary of a Wimpy Kid", "Jeff Kinney", 2, true);  
        
        library.addBook(book1);
        library.addBook(book2);

        library.removeBook(book2); 

         ArrayList<Book> res = library.books; 
         ArrayList<Book> exp = new ArrayList<>(); 
         exp.add(book1); 

         if(res.equals(exp)) { 
            System.out.println("PASS 2");
         } 
         else { 
            System.out.print("Expected: " + exp);
            System.out.print(" Actual: " + res);
         }
    } 

    public static void checkTest() { 
        Library library = new Library();  

        Book book1 = new Book("The Grace Year", "Kim Ligget", 1, true); 
        library.addBook(book1); 
        library.checkOut(book1);

      
    
    } 
    public static void isbnTest() {  
        Library library = new Library();  

        Book book1 = new Book("The Grace Year", "Kim Ligget", 1, true);
        Book book2= new Book("Diary of a Wimpy Kid", "Jeff Kinney", 2, true);  
        library.addBook(book1);
        library.addBook(book2); 

        library.getByIsbn(2);
        

    } 

    public static void titleTest() {  
        Library library = new Library();  

        Book book1 = new Book("The Grace Year", "Kim Ligget", "1", true);
        Book book2= new Book("Diary of a Wimpy Kid", "Jeff Kinney", "2", true);  
        library.addBook(book1);
        library.addBook(book2); 

        System.out.println(library.getByTitle("the grace year"));

    } 
    public static void filterA() { 
        Library library = new Library();  

        Book book1 = new Book("The Grace Year", "Kim Ligget", "1", true);
        Book book2= new Book("Diary of a Wimpy Kid", "Jeff Kinney", "2", true); 
        Book book3= new Book("Diary of a Wimpy Kid: Dog Days", "Jeff Kinney", "3", false); 
        Book book4= new Book("Diary of a Wimpy Kid: Boardwalk", "Jeff Kinney", "4", false); 
        Book book5= new Book("Diary of a Wimpy Kid: Cabin Fever", "Jeff Kinney", "5", true);  
        library.addBook(book1);
        library.addBook(book2); 
        library.addBook(book3); 
        library.addBook(book4); 
        library.addBook(book5);  
       // library.filterByAuthor("Jeff Kinney"); 
       library.filterByAvailability();

    }
    
}

import java.util.ArrayList;

public class LibraryTest { 

    public static void main(String[] args) { 
        System.out.println(addTest()); 
        removeTest();
        

    
    } 

    public static boolean addTest() {  
        Library library = new Library(); 

        Book book1 = new Book("The Grace Year", "Kim Ligget", "1", true);
        Book book2= new Book("Diary of a Wimpy Kid", "Jeff Kinney", "2", true);

        String res1 = library.addBook(book1);
        String res2 = library.addBook(book2);  

        String exp1 = "The Grace Year Added!";
        String exp2 = "Diary of a Wimpy Kid Added!";

        if (res1.equals(exp1) && res2.equals(exp2)) { 
            System.out.println("PASS"); 
            return true;
        } 
        System.out.println("FAIL");
        System.out.println("Expected: ");
        System.out.println(exp1);
        System.out.println(exp2); 
        System.out.println("Actual: "); 
        System.out.println(res1); 
        System.out.println(res2);  
        return false;

    } 
    public static void removeTest() {  
        Library library = new Library();  

        Book book1 = new Book("The Grace Year", "Kim Ligget", "1", true);
        Book book2= new Book("Diary of a Wimpy Kid", "Jeff Kinney", "2", true);  
        
        library.addBook(book1);
        library.addBook(book2);

        library.removeBook(book2); 

         ArrayList<Book> res = library.books; 
         ArrayList<Book> exp = new ArrayList<>(); 
         exp.add(book1); 

         if(res.equals(exp)) { 
            System.out.println("PASS");
         } 
         else { 
            System.out.print("Expected: );
            System.out.print(" Actual: " + res);
         }





        



    }
    
}

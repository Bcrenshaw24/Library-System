import java.util.ArrayList;


public class Library { 
    public ArrayList<Book> books; 
    
    public Library() { 
        books = new ArrayList<>();
    } 

    private boolean search(Book book) {  
        String target = book.title.toLowerCase(); 
      for(int i = 0; i < books.size(); i++) { 
        if (target.equals(books.get(i).title.toLowerCase())) { 
            return true;
        }
      } 
      return false;
    } 

    private String cleaner(String word) {  
        StringBuilder nb = new StringBuilder(); 
        boolean firstWord = true;
        for(int i = 0; i < word.length(); i++) {  
            if (!firstWord) { 
               nb.append(Character.toLowerCase(word.charAt(i)));
            } 
            if (firstWord) {  
                nb.append(Character.toUpperCase(word.charAt(i)));
                firstWord = false;
            } 
            if (word.charAt(i) == ' ') { 
                nb.append(word.charAt(i));
            }

        } 
        return nb.toString();

    }

    public String addBook(Book book) {  
        book.title = cleaner(book.title); 
        book.author = cleaner(book.author);
        boolean result = search(book);  
        if(result) { 
                System.out.println("Book already in library"); 
                return "-99"; 
        }
            books.add(book);  
            return (book.title + " Added!");
    }
        
  
    public String removeBook(Book book) { 
        boolean result = search(book);  
        if (result) { 
            books.remove(book); 
            return(book.title + " Removed!");
        }  
        return "Book not found";
         
    }

    public String checkOut(Book book) { 
        boolean result = search(book); 
        if(result) { 
            if(book.isAvailable) { 
                book.isAvailable = false; 
                return (book.title + " has been successfully checked out!");
            } 
            return("This book is currently unavailable");
        } 
        return("We don't own this book");

    }
        

    public String checkIn(Book book) { 
        boolean result = search(book);   
        if(result) { 
            if(!book.isAvailable) { 
                book.isAvailable = true; 
                return (book.title + " is now returned!");
            } 
            return("This book is already available");
        } 
        return("We don't own this book");
        

    }   

    public void getByIsbn(int isbn) { 
        if(isbn >= books.size() || isbn < 1) { 
            System.out.println("ISBN mus be between 1 and " + (books.size()));
        } 
        System.out.println(books.get(isbn - 1).displayInfo());
    } 
    public void getByTitle(String title) { 
        title = title.toUpperCase();  
        
    }

   public void displayBooks() {  
       for(int i = 0; i < books.size(); i++) { 
       System.out.println(books.get(i).displayInfo()); 
       }


   }
    
}

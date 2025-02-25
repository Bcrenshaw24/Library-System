import java.util.ArrayList;

public class Library { 
    public ArrayList<Book> books; 
    
    public Library() { 
        books = new ArrayList<>();
    } 

    private boolean search(String title) {  
        String target = title.toLowerCase(); 
      for(int i = 0; i < books.size(); i++) { 
        if (target.equals(books.get(i).title.toLowerCase())) { 
            return true;
        }
      } 
      return false;
    } 

    public String cleaner(String word) {  
        StringBuilder nb = new StringBuilder(); 
        boolean first = true; 
        for(int i = 0; i < word.length(); i++) { 
             if (first) { 
                nb.append(Character.toUpperCase(word.charAt(i))); 
                first = false; 
                continue;
             } 
             if(word.charAt(i) == ' ') { 
                nb.append(word.charAt(i)); 
                first = true;
             } 
             else { 
                nb.append(Character.toLowerCase(word.charAt(i)));
             }
        } 
        return nb.toString();
    }

    public void addBook(Book book) {  
        book.title = cleaner(book.title); 
        book.author = cleaner(book.author);
        boolean result = search(book.title);  
        if(result) { 
                System.out.println("Book already in library");
        } else {
            books.add(book);  
            System.out.println(book.title + " Added!"); 
        }
    }
         
    public void removeBook(Book book) { 
        boolean result = search(book.title);  
        if (result) { 
            books.remove(book); 
            System.out.println(book.title + " Removed!");
        }  
        else{ 
            System.out.println("Book not found"); 
        }   
    }

    public void checkOut(Book book) { 
        boolean result = search(book.title); 
        if(result) { 
            if(book.isAvailable) { 
                book.isAvailable = false; 
                System.out.println(book.title + " has been successfully checked out!");
            }  
            else{
            System.out.println("This book is currently unavailable"); 
            }
        } 
    }
        
    public void checkIn(Book book) { 
        boolean result = search(book.title);   
        if(result) { 
            if(!book.isAvailable) { 
                book.isAvailable = true; 
                System.out.println(book.title + " is now returned!");
            }  
            else{
            System.out.println("This book is already available"); 
            }
        }  
        else {
        System.out.println("We don't own this book"); 
        }
    }   

    public void getByIsbn(int isbn) { 
        if(isbn > books.size() || isbn < 1) { 
            System.out.println("ISBN must be between 1 and " + (books.size()));
        }  
        else{
        System.out.println(books.get(isbn - 1).displayInfo()); 
        }
    } 
    public String getByTitle(String title) { 
        title = cleaner(title);  
        for(Book book: books) { 
            if(book.title.equals(title)) { 
                return(book.displayInfo());
            }
        } 
        return ("Book not found"); 
    } 

    public void filterByAuthor(String author) {  
        author = cleaner(author);
        for(Book book: books) { 
            if(book.author.equals(author)) { 
                System.out.println(book.displayInfo());
            }
        }
    } 
    public void filterByAvailability() { 
        for(Book book: books) { 
            if(book.isAvailable) { 
                System.out.println(book.displayInfo());
            }
        }
    }

   public void displayBooks() {  
       for(int i = 0; i < books.size(); i++) { 
       System.out.println(books.get(i).displayInfo()); 
       }


   }
    
}

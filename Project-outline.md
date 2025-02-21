Project - Library Simulator


Book Class { 
    Constructor { 
        title;
        author; 
        genre; 
        isbn; 
        isAvailable;
    }   

    public String displayInfo() { 
        returns all data of book;
    } 

} 

Library Class { 
    Constructor { 
        public ArrayList<Books> books; 
        books = new ArrayList<>();
    } 

    search(Book book) { 
        searches the list to see if a book is there for a number of reasons
    } 

    addBook (Book book) {  
        calls the search method; 
        either returns error or adds book to library
    } 

    removeBook (Book book) { 
        calls the search method; 
        either returns an error or removes book
    } 
    checkOut(Book book) { 
        searches for the book; 
        returns error if book isnt found; 
        tells user that the book is available and now checked out by them or that it isnt available;
    } 
    checkIn (Book book) {  
        searches for the book; 
        returns error if book isnt found; 
        tells user that the book has been returned or that it is already available;
        
    } 
    displayAllBooks () { 
        Uses the displayInfo() method from the book class for every book
    } 

    getByIsbn (String isbn) { 
        finds a book by its isbn number
    } 
    
    getByTitle (String title) { 
        finds a book by its title
    } 
    filterByAuthor(String author) { 
        prints all books by an author
    } 

    filterByAvailability() { 
        shows all available books
    } 
}  

LibraryTest Class { 
    simulates through test cases to ensure it works properly
} 

LibrarySimulation Class { 
    abstracts code and makes a user friendly console gui
} 


Summary: 
- I think that the methods are rather easy to implement its just the volume 
- Takes a bit more planning and thought than usual 

Problem Analysis: 
- Key data will obviously be the books information 
- All of that info can be stored within the class 
- The best way to handle the books is an array list 
- I'll leave the isbn assignment to the computer to avoid problems  
- I'll find a way to index books by isbn for a quick lookup
- I might need to either clean the input or standardize the output like having everything in uppercase 
- The hardest part will be the simulation 
- All variables but the avalability are strings, should have comments that help define that  

Uncovered Problems: 
- Assign ISBMs to match the array index to allow dynamic readjustment 
- Make a cleaner function that will correctly capitalize titles and author names regardless of input assuming the input is somewhat valid 
- Find a way to dynamically add objects to the library without hardcoding variables/objects 




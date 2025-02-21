public class Book { 
    public String title; 
    public String author;  
    public String isbn; 
    public boolean isAvailable; 


    public Book(String title, String author, String isbn, boolean isAvailable) { 
        this.title = title; 
        this.author = author; 
        this.isbn = isbn; 
        this.isAvailable = isAvailable;
    }  

    public String displayInfo() { 
        return ("Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Available: " + isAvailable);
    }
}
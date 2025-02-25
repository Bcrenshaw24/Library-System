public class Book { 
    public String title; 
    public String author;  
    public int isbn; 
    public boolean isAvailable; 


    public Book(String title, String author, int isbn, boolean isAvailable) { 
        this.title = title; 
        this.author = author; 
        this.isbn = isbn;
        this.isAvailable = isAvailable;
    }   

    public void assignIsbm(int index) { 
        this.isbn = index - 1;
    }

    public String displayInfo() { 
        return ("Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Available: " + isAvailable);
    }
}
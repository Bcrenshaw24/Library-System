import java.util.Scanner;

public class LibrarySimulation {  

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in); 
        Library library = new Library();

        while (true) {  
            System.out.println("-------Library Simulation----------");
            System.out.println("Menu Options:"); 
            System.out.println("1. Add a new book."); 
            System.out.println("2. Remove a book."); 
            System.out.println("3. Check a book out."); 
            System.out.println("4. Check a book in."); 
            System.out.println("5. Find a book."); 
            System.out.println("6. Show books."); 
            System.out.println("7. Exit.");  

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            if(choice == 1) { 
                System.out.println("You chose 1, add a book!"); 
                System.out.println("Book Title:");  
                String title = scanner.nextLine(); 
                System.out.println("Author: ");
                String author = scanner.nextLine();  
                int isbn = library.books.size() + 1; 
                library.addBook(new Book(title, author, isbn, true));
            } 
            else if(choice == 2) {  
                System.out.println("You chose 2, remove a book!"); 
                System.out.println("Book Title:");  
                String title = library.cleaner(scanner.nextLine());   
                int index = 0;
                Book remove = new Book("Place", "Place", 1, false);
                boolean found = false;
                for(Book book: library.books) { 
                    if(book.title.equals(title)) { 
                        index = book.isbn - 1;
                        remove = book; 
                        found = true;
                    }
                }  
                if (found) { 
                    library.removeBook(remove);
                for(int i = index; i < library.books.size(); i++) { 
                    library.books.get(i).isbn = i + 1;
                } 
            } else { 
                System.out.println("Book not found");
            }
            } 
            else if (choice == 3) {  
                System.out.println("You chose 3, check out a book!"); 
                System.out.println("Book Title:");  
                boolean found = false;
                String title = library.cleaner(scanner.nextLine());  
                for (Book book: library.books) { 
                    if (title.equals(book.title)) { 
                        library.checkOut(book); 
                        found = true;
                    }
                }  
                if(!found) { 
                    System.out.println("Book not found");
                }

            } 
            else if (choice == 4) {  
                System.out.println("You chose 4, check in a book!"); 
                System.out.println("Book Title:");  
                boolean found = false;
                String title = library.cleaner(scanner.nextLine());  
                for (Book book: library.books) { 
                    if (title.equals(book.title)) { 
                        library.checkIn(book); 
                        found = true;
                    }
                }  
                if(!found) { 
                    System.out.println("Book not found");
                }

            }  
            else if (choice == 5) { 
                System.out.println("1. Find By Title"); 
                System.out.println("2. Find By ISBN");  
                
                int find = scanner.nextInt();
                scanner.nextLine(); 

                if(find == 1) { 
                    System.out.println("Book Title:"); 
                    String title = scanner.nextLine(); 
                    String result = library.getByTitle(title); 
                    System.out.println(result);
                } 
                else if (find == 2) { 
                    System.out.println("Book ISBN:"); 
                    int isbn = scanner.nextInt();   
                    scanner.nextLine(); 
                    library.getByIsbn(isbn);
                }
            } 
            else if (choice == 6) {  
                System.out.println("1. Show All Books");
                System.out.println("2. Filter By Author"); 
                System.out.println("3. Filter By Availability"); 
                int filter = scanner.nextInt(); 
                scanner.nextLine();

                if(filter == 1) { 
                    library.displayBooks();
                }
                else if(filter == 2) { 
                    System.out.println("Author Name:"); 
                    String author = scanner.nextLine(); 
                    library.filterByAuthor(author);
                } 
                else if(filter == 3) { 
                    library.filterByAvailability();
                }

            } 
            else if (choice == 7) { 
                break;
            } 
            else { 
                System.out.println("Invalid input");
            }

        } 
    }
    
}

public class Book {
  String title;
  String author;
  int pages;
  
  public Book(String t, String a, int p){
    this.title = t;
    this.author = a;
    this.pages = p;
  }

  public void display(){
    System.out.println("The: " + title);
    System.out.println("Author: " + author);
    System.out.println("Pages: " + pages + "\n");
  }

  public static void main(String[] args){
    Book b1 = new Book("1984", "George Orwell", 328);
    Book b2 = new Book("The Hobbit", "J.R.R Tolkien", 310);
    Book b3 = new Book("The Quee", "Kristel.C", 312);
    Book b4 = new Book("Over", "D.C.K", 315);
    Book b5 = new Book("Pass", "K.K.K.", 450);

    b1.display();
    b2.display();
    b3.display();
    b4.display();
    b5.display();
  }
}
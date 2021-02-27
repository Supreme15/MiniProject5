import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Hello, what is your name?");
    //Prints out hello and asks for person name
    String name = scan.next();
    //lookinh for reponse and saving it to variable "name"
    System.out.println("Do you like books " + name);
    //prints out question that pertains to the theme of my code.
    scan.next();
    //looks for input but does not save
    System.out.println("How many pages does this book have?");
    //prints out question that pertains to the theme of my code.
    int page = scan.nextInt();
    //looking and saving number of pages
    int pageOrder = pages(page);
    //calling "page method" and declaring a new variable for the number of pages after the method runs
    System.out.println("You should read " + pageOrder + " per month for two months!");
    //prints out statement that pertains to the theme of my code and new variable after the method runs.


  }

  //Pages method
  public static int pages(int page)
  {
    if(page == 0)
    {
      System.out.println("Alright");
      //when the amount of pages hit zero it prints "Alright".
      return page;
      //saves the new number
    }else{ 
      return page - pages(page - 1);
      //pages are subtracted untill 0.
    }
    
  }
}
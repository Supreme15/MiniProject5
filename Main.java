import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Hello, what is your name?");
    String name = scan.next();
    System.out.println("Do you like books " + name);
    scan.next();
    System.out.println("How many pages does this book have?");
    int pages = scan.nextInt();
    int pageOrder = pages();

  }

  //Pages method
  public static int pages(int page)
  {
    if(page == 0)
    {
      System.out.println("This is not enough pages");
    }else{ 
      System.out.println(page);
      return page - pages(page - 1);
    }
    return page;
  }
}
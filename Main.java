import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("How musicians are in your group?");
    int memb = scan.nextInt();
    int newOrder = members(memb);
    System.out.println("Please divide your group into " + newOrder + " in each row");
  }

  //
  public static int members(int memb)
  {
    if(memb == 2)
    {
       return 0;
       
    }else{ 
     return memb % members(memb - 1);
    }
  }
}
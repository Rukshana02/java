import java.util.Scanner;
public class Assignment7 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    char c;

    System.out.println("Do you love java?");
    c = input.next().charAt(0);

    if(c == 'Y' || c == 'y'){
        System.out.println("You are  java lover");
    }
    else if(c == 'N' || c == 'n'){
        System.out.println("You are not java lover");
    }
  }
}
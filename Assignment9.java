import java.util.*;
public class Assignment9 {
  public static void main(String[] args) {
    // get the OPTION from user
    Scanner input = new Scanner(System.in);
    int op = input.nextInt();

    switch(op){
        case 0:
        System.out.println("Selected language is Bengali");
        break;

        case 1:
        System.out.println("Selected language is Hindi");
        break;

        case 2: 
        System.out.println("Selected language is Urdu");
        break;

        default:
        System.out.println("Selected language is English");
        break;

    }

    // use switch, case, break and default

    // Selected language is Bengali
    // Selected language is Hindi
    // Selected language is Urdu
    // Selected language is English
  }
}
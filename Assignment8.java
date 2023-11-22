import java.util.*;
public class Assignment8 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Have you completed your masters?\nYes or No?");
    char m;
    m = input.next().charAt(0);

    System.out.println("Are you fulent in English??\nYes or No?");
    char e;
    e = input.next().charAt(0);

    if(m == 'Y' || m == 'y' && e == 'Y' || e == 'y'){
        System.out.println("You are eligible to for the job interview");
    }
    else{
        System.out.println("Sorry, You are not eligible to for the job interview");
    }
    
}
}
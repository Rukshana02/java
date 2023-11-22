import java.util.Scanner; // import java.util.*;
public class InputDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;

        System.out.println("Enter a number: ");

        n = input.nextInt();

        System.out.println("Number: " + n);
    }
}

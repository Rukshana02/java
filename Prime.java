import java.util.Scanner;
class Prime {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int count=0;
        for(int i = 2; i<n; i++){
            if(n%i == 0){   
                count++;    
                break;
            }               

        if(count == 0){   
            System.out.println("prime no.");            
        }
        else{
            System.out.println("Not Prime no.");
        }

    }
    
}

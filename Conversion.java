public class Conversion {
    public static void main(String[] args){
        

        int i = 260;
        byte b;
        double d = 320.254;

        System.out.println("Convesion of int to byte: ");
        b = (byte) i;
        System.out.println("i = " + i + " and b = " + b);
         
        System.out.println("Convesion of double to int: ");
        i = (int) d;
        System.out.println("d = " + d + " and i = " + i);
    }
}

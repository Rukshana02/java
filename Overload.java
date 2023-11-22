public class Overload {
    public static void main(String [] args){
        OverloadDemo obj = new OverloadDemo();
        double result;

        //call all versions of test()
         obj.test();
         obj.test(10);
         obj.test(5,15);
         result = obj.test(323.25);
         System.out.println("Result of obj.test(323.25) is = " + result);
    }
}

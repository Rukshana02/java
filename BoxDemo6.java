public class BoxDemo6 {
    public static void main(String [] args){
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        
        
        vol = mybox1.volume();
        System.out.println("Volume 1 is: " + vol);

        vol = mybox2.volume();
        System.out.println("Volume 2 is: " + vol);
    }
}
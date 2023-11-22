public class OverloadCons {
    public static void main(String [] args){
        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box();
        Box mybox3 = new Box(3);

        double vol;

        // volume of 1st box
        vol = mybox1.volume();
        System.out.println("Volume 1 is: " + vol);

        // volume of 2nd box
        vol = mybox2.volume();
        System.out.println("Volume 2 is: " + vol);

        // volume of 3rd box or cube
        vol = mybox3.volume();
        System.out.println("Volume 3 is: " + vol);

    }
}

public class BoxDemo3 {
    public static void main(String [] args){
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        //**to access a instance variable by code that is not part of the same class
        // it must be accessed through an object with the help of dot(.) operator**

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        mybox1.volume();
        mybox2.volume();
    }
}

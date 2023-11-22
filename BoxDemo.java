class BoxDemo {
    public static void main(String [] args){
        Box mybox = new Box();
        double volume;

        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        volume = mybox.width * mybox.height * mybox.depth;
        System.out.println("Volume is " + volume);
    }
}

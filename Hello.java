    class Hello {
    public static void main(String[] args){
        int lightSpeed;
        long days;
        long second;
        long distance;
        days = 1000;
        lightSpeed = 2345678;

        second = days * 24* 60 *60;
        distance = lightSpeed * second;
        System.out.println("In " + days + "days");
        System.out.print("Light will travel about");
        System.out.println(distance + " miles. ");

        

    }
    
}

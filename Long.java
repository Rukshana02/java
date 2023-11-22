class Long {
    public static void main(String[] args){
        int lightSpeed;
        long days;
        long second;
        long distance;
        lightSpeed = 186000;
        days = 1000;

        second = days * 24* 60 *60;
        distance = lightSpeed * second;
        System.out.println("In " + days + " days ");
        System.out.println("Light will travel about ");
        System.out.println(distance + " miles. ");

    }
    
}

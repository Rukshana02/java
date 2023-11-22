class Example {
    public static void main(String[] args){
        int x,y;
        x=10;
        y=20;
        
        if(x<y) System.out.println("x is smaller than y");

        x=x*2;
        if(x==y) System.out.println("Now x is equal to y");

        x=x*2;
        if(x>y) System.out.println("Now x is greater than y");

        if(x==y) System.out.println("you won't see this");
    }
}

class Box {
    double width;
    double height;
    double depth;
// Here, Box defines 3 constructors 
//to initialize the dimensions of a box various ways
    
    // Box constructor used when all dimensions specified
   Box(double w, double h, double d){
    width = w;
    height = h;
    depth = d;
   }

   // Box constructor used when no dimensions specified
   Box(){
    width = -1;
    height = -1;
    depth = -1;
   }
   //Box constructor used when Cube is created
   Box(double len){
    width = height = depth = len;
   }

    // display volume of a box 
    //adding a method to the Box class

    double volume(){
        return width * height * depth;
    }
}



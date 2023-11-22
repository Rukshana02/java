public class Box2 {
    double width;
    double height;
    double depth;

    // display volume of abox 
    //adding a method to the Box class

    double volume(){
        return width * height * depth;
    }
   Box2(double w, double h, double d){
    width = w;
    height = h;
    depth = d;
   }
   
}

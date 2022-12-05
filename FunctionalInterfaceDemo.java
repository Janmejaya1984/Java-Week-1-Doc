
@FunctionalInterface
interface Shape  {
    void draw();
    
    //Double perimeter(); //Uncomment the abstract method to observe the difference
    
    public default Double area(Integer radius)
    {
        return radius*3.14;
    }
    
    public default Double area(Double height, Double width)
    {
        return height*width;
    }
    
    public static void print()
    {
        System.out.println("Inside Shape");
    }
}

class Tester 
{
    public static void main (String[] args) {
        Shape.print();
    }
}
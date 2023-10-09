public class Rectangle {
    int width;
    int length;

    void CalculateArea(){
        System.out.println("Area = "+width * length);
    }

    void calculatePerimeter(){
        System.out.println("Perimeter = "+2 * (width + length));
    }

    public static void main(String[] args) {
        Rectangle myRectangle1 = new Rectangle();
        myRectangle1.width = 5 ;
        myRectangle1.length = 6 ;
        Rectangle myRectangle2 = new Rectangle();
        myRectangle2.width = 2;
        myRectangle2.length = 3;

        System.out.println("Rectangle 1");
        myRectangle1.CalculateArea();
        myRectangle1.calculatePerimeter();
        System.out.println();
        System.out.println("Rectangle 2");
        myRectangle2.CalculateArea();
        myRectangle2.calculatePerimeter();


    }
}

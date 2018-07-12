class ShapeCalculator {

//    Square square = new Square();
//    Rectangle rectangle = new Rectangle();
//    Circle circle = new Circle();
//    Triangle triangle = new Triangle();

    int squareArea(Square square) {
        return square.a * square.a;
    }
    double circleArea(Circle circle){
        return circle.ray * 3.14 * 2;
    }
    double trianglePerimeter(Triangle triangle){
        return triangle.a + triangle.b + triangle.c;
    }
    double rectPerimeter(Rectangle rectangle){
         return 2*rectangle.a + 2*rectangle.b;
    }
}

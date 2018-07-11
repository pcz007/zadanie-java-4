class ShapeCalculator {

//    Square square = new Square();
//    Rectangle rectangle = new Rectangle();
//    Circle circle = new Circle();
//    Triangle triangle = new Triangle();

    double squareArea(Square square) {
        return square.a * 2;
    }
    double circleArea(Circle circle){
        return circle.ray * 3.14 * 2;
    }
    double trianglePerimeter(Triangle triangle){
        return triangle.a + triangle.b + triangle.c;
    }

    double rectPerimeter(Rectangle rectangle){
         return rectangle.a + rectangle.b;
    }
}

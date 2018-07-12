public class ShapeCalcTest {

    public static void main(String[] args) {

        ShapeCalculator calc = new ShapeCalculator();

        Rectangle rect = new Rectangle(10,5);
        double wynik = calc.rectPerimeter(rect);
        System.out.println("Pole kwadratu jest równe: " + wynik);

        Circle circ = new Circle(10.3);
        double wynikCircle = calc.circleArea(circ);
        System.out.println("Obwód koła jest równy: " + wynikCircle);

        Square sqr = new Square(4);
        int wynikSqr = calc.squareArea(sqr);
        System.out.println("Pole kwadratu wynosi: " + wynikSqr);

        Triangle trg = new Triangle(12.5,15.9,6);
        double wynikTrg = calc.trianglePerimeter(trg);
        System.out.println("Obwód trójkąta wynosi: " + wynikTrg);

    }
}

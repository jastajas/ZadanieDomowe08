public class TestTriangle {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(5,4,3);
        TriangleCalc triangleCalc = new TriangleCalc();

        if (triangleCalc.isRightTriangle(triangle)){
            System.out.println("Trójkąt jest prostokątny.");
        } else {
            System.out.println("Trójkąt nie jest prostokątny.");
        }


    }
}

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Wprowadź bok 1 trójkąta: ");
        int side1 = sc.nextInt();
        System.out.println("Wprowadź bok 2 trójkąta: ");
        int side2 = sc.nextInt();
        System.out.println("Wprowadź bok 3 trójkąta: ");
        int side3 = sc.nextInt();

        if (side1 < side2 + side3 && side2 < side1 + side3 && side3 < side1 + side2){
            Triangle triangle = new Triangle(side1,side2,side3);
            TriangleCalc triangleCalc = new TriangleCalc();

            if (triangleCalc.isRightTriangle(triangle)){
                System.out.println("Trójkąt jest prostokątny.");
            } else {
                System.out.println("Trójkąt nie jest prostokątny.");
            }
        } else {
            System.out.println("Podane długości boków nie utworzą trójkąta.");
        }
    }
}

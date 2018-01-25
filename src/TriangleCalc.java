import java.util.Arrays;
import static java.lang.Math.*;

public class TriangleCalc {

    public boolean isRightTriangle(Triangle triangle){
        int[] sides = new int[3];
        sides[0] = triangle.getSide1();
        sides[1] = triangle.getSide2();
        sides[2] = triangle.getSide3();

        Arrays.sort(sides);
        //int side1 = sides[0]
        //int side2 = sides[1]
        //int side3 = sides[2]

        return (int)pow(sides[2],2) == (int)pow(sides[1],2) + (int)pow(sides[0],2);
        //return (int)pow(siede3,2) == (int)pow(siede2,2) + (int)pow(siede1,2);



        /*int hypotenuse = triangle.getHypotenuse();
        int cathetus1 = triangle.getCathetus1();
        int cathetus2 = triangle.getCathetus2();
        if( (hypotenuse^2) == (cathetus1^2) + (cathetus2^2) ){
            return true;
        } else {return false;}*/
    }
}

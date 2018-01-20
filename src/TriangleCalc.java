public class TriangleCalc {

    public boolean isRightTriangle(Triangle triangle){
        int hypotenuse = triangle.getHypotenuse();
        int cathetus1 = triangle.getCathetus1();
        int cathetus2 = triangle.getCathetus2();
        if( (hypotenuse^2) == (cathetus1^2) + (cathetus2^2) ){
            return true;
        } else {return false;}
    }
}

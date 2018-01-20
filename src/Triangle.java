public class Triangle {

    private int hypotenuse;
    private int cathetus1;
    private int cathetus2;

    public Triangle() {
    }

    public Triangle(int hypotenuse, int cathetus1, int cathetus2){
        this.hypotenuse = hypotenuse;
        this.cathetus1 = cathetus1;
        this.cathetus2 = cathetus2;
    }

    public void setHypotenuse(int hypotenuse){
        this.hypotenuse = hypotenuse;
    }

    public int getHypotenuse(){
        return hypotenuse;
    }

    public int getCathetus1() {
        return cathetus1;
    }

    public void setCathetus1(int cathetus1) {
        this.cathetus1 = cathetus1;
    }

    public int getCathetus2() {
        return cathetus2;
    }

    public void setCathetus2(int cathetus2) {
        this.cathetus2 = cathetus2;
    }
}

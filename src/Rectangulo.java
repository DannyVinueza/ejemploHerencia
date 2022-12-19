public class Rectangulo extends Figura{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
        calcularArea();
        calcularPerimetro();
    }

    protected void calcularArea(){
        area = base*altura;
    }

    protected void calcularPerimetro(){
        perimetro = base * 2 + altura * 2;
    }


}
/*
public class Rectangulo extends Figura{
    double largo, ancho;

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
}
*/
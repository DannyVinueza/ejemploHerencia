
public class Cuadrado extends Figura{
    double lado;
    public Cuadrado(double lado){
        this.lado = lado;
        calcularArea();
        calcularPerimetro();
    }
    @Override
    protected void calcularArea(){
        area=lado*lado*100;
    }
    @Override
    protected void calcularPerimetro(){
        perimetro = lado * 4 * 100;
    }
}
/*
public class Cuadrado extends Figura{
    double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
*/

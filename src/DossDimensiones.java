public class DossDimensiones {//Clase padre
    private double base;
    private double altura;

    DossDimensiones(){
        base=altura=0.0;
    }

    DossDimensiones(double b,double h){
        base = b;
        altura = h;
    }

    DossDimensiones(double x){
        base=altura=x;
    }

    public void mostrarDimensiones(){
        System.out.println("La base es: " + base + " y la altura es: " + altura);

    }

    public double getBase() {
        return base;
    }

    public void setBase(double b) {
        base = b;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double h) {
        altura = h;
    }
}

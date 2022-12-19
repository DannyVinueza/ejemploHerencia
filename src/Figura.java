public class Figura {
    int x, y;
    double perimetro, area;
    public void setX(int x){
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void calcularPerimetro(){
        perimetro=(2*x)+(2*y);
    }

    public void calcularArea(){
        area = x*y;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
}

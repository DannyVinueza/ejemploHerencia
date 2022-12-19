public class Triangulo extends Figura {//Clase hija
    private double base;
    private double altura;
    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
        calcularArea();
        calcularPerimetro();

    }
    @Override
    protected void calcularArea(){area = (base * altura)/2;}
    @Override
    protected void calcularPerimetro(){perimetro = base *3;}
}


/*public class Triangulo extends DossDimensiones {//Clase hijo
    private String estilo;
    Triangulo(){//Constructor por defecto
        super();//Esta diciendo que va a heredar los atributos y los metodos
        estilo = "ninguno";
    }

    Triangulo(String s, double b, double h){
        super(b,h);
        estilo=s;
    }

    Triangulo(double x){
        super(x);
        estilo="Estilo nuevo";
    }

    double area(){
        return (getAltura()*getBase())/2;
    }

    void mostrarEstilo(){
        System.out.println("El triangulo tiene " + estilo);
    }
}
*/
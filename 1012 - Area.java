import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double A = entrada.nextDouble();
        double B = entrada.nextDouble();
        double C = entrada.nextDouble();

        FormaGeometrica triangulo = new Triangulo(A, C);
        FormaGeometrica circulo = new Circulo(C);
        FormaGeometrica trapezio = new Trapezio(A, B, C);
        FormaGeometrica quadrado = new Quadrado(B);
        FormaGeometrica retangulo = new Retangulo(A, B);

        System.out.printf("TRIANGULO: %.3f%n", triangulo.calcularArea());
        System.out.printf("CIRCULO: %.3f%n", circulo.calcularArea());
        System.out.printf("TRAPEZIO: %.3f%n", trapezio.calcularArea());
        System.out.printf("QUADRADO: %.3f%n", quadrado.calcularArea());
        System.out.printf("RETANGULO: %.3f%n", retangulo.calcularArea());

        entrada.close();
    }
}

abstract class FormaGeometrica{
    public abstract double calcularArea();
}

class Triangulo extends FormaGeometrica{
    private double base;
    private double altura;

    //------------------construtor--------------
    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    //------------------metodos------------------
    @Override
    public double calcularArea(){
        return (base * altura) / 2;
    }
}

class Circulo extends FormaGeometrica{
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double calcularArea(){
        return 3.14159 * Math.pow(raio , 2);
    }
}

class Trapezio extends FormaGeometrica{
    private double baseMenor;
    private double baseMaior;
    private double altura;

    public Trapezio(double baseMenor, double baseMaior, double altura){
        this.baseMenor = baseMenor;
        this.baseMaior = baseMaior;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return ((baseMenor + baseMaior) * altura) / 2;
    }
}

class Quadrado extends FormaGeometrica{
    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return Math.pow(lado, 2);
    }
}

class Retangulo extends FormaGeometrica{
    private double altura;
    private double comprimento;

    public Retangulo(double altura, double comprimento){
        this.altura = altura;
        this.comprimento = comprimento;
    }

    @Override
    public double calcularArea(){
        return altura * comprimento;
    }
}
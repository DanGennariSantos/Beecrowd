import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o primeiro ponto no formato (x1 y1):");
        String coordenadaA = teclado.nextLine();

        System.out.println("Informe o segundo ponto no formato (x2 y2):");
        String coordenadaB = teclado.nextLine();

        Ponto pontoA = new Ponto(coordenadaA);
        Ponto pontoB = new Ponto(coordenadaB);

        double x1 = pontoA.getPontoX();
        double y1 = pontoA.getPontoY();
        double x2 = pontoB.getPontoX();
        double y2 = pontoB.getPontoY();

        double distancia = Math.sqrt(pow((x2 - x1),2) + pow((y2 - y1),2));

        System.out.printf("%.4f%n", distancia);
        teclado.close();

    }
}

class Ponto{
    private String coordenada;
    private double pontoX;
    private double pontoY;

    public Ponto (String coordenada){
        this.coordenada = coordenada;
        this.pontoX = Double.parseDouble(coordenada.split(" ")[0]);
        this.pontoY = Double.parseDouble(coordenada.split(" ")[1]);
    }

    public double getPontoX() {
        return pontoX;
    }

    public double getPontoY() {
        return pontoY;
    }

}
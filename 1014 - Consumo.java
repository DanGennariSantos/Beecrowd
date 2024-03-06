import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

        int distancia = entrada.nextInt();
        double litros = entrada.nextDouble();

        System.out.printf("%.3f km/l\n", calcularConsumo(distancia, litros));

        entrada.close();
    }
    public static double calcularConsumo(int distancia, double litros){
        return distancia / litros;
    }
}

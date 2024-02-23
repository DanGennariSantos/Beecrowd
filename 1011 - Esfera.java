import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.printf("VOLUME = %.3f%n", calcularVolumeEsfera(entrada));
        entrada.close();
    }

    public static double calcularVolumeEsfera(Scanner entrada){
        double raio = entrada.nextDouble();

        return (4/3.0) * Math.PI * Math.pow(raio,3);
    } 
}
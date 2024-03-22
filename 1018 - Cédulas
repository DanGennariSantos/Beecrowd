import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //System.out.println("Informe o valor em reais: ");
        int valor = teclado.nextInt();

        System.out.println(valor);

        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        calcularNotas(valor, notas, 0);

        teclado.close();
    }

    public static void calcularNotas(int valor, int[] notas, int indice) {
        if (indice < notas.length) {
            int quantidade = valor / notas[indice];
            valor = valor % notas[indice];
            System.out.println(quantidade + " nota(s) de R$ " + notas[indice] + ",00");
            calcularNotas(valor, notas, indice + 1);
        }
    }
}

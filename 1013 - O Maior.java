import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int A = entrada.nextInt();
        int B = entrada.nextInt();
        int C = entrada.nextInt();

        ArrayList<Integer> valores = new ArrayList<>();

        // Adicionando os valores ao ArrayList
        valores.add(A);
        valores.add(B);
        valores.add(C);

        int maiorValor = Collections.max(valores);

        // Imprimindo o maior valor
        System.out.println(maiorValor + " eh o maior");

        entrada.close();
    }
}

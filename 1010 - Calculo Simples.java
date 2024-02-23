import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main{

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int qtdPecas = 2;

        List<Peca> pecas = new ArrayList<>();

        for (int i = 0; i < qtdPecas; i++){
            Peca peca = Peca.criarPeca(entrada);//criar peça
            pecas.add(peca);
        }

        double valorTotal = 0;
        
        for (Peca peca : pecas){
            valorTotal += peca.calcularValor();
        }

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);
        entrada.close();
    }
    
}

class Peca{
    int codigo;
    int qtd;
    double valor;

    //-------------construtor----------------------
    public Peca(int codigo, int qtd, double valor){
        this.codigo = codigo;
        this.qtd = qtd;
        this.valor = valor;
    }

    //--------------metodos--------------------------
    public static Peca criarPeca(Scanner entrada){
        //Recebe dados
        int codigo = entrada.nextInt();
        int qtd = entrada.nextInt();
        double valor = entrada.nextDouble();
        
        return new Peca(codigo, qtd, valor);
    }

    public double calcularValor(){
        return qtd * valor;
    }

}

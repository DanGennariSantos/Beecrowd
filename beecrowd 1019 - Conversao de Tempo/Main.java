import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entradaTeclado = new Scanner (System.in);

        System.out.println("Informe o valor em segundos:");
        int tempoEmSegundos = entradaTeclado.nextInt();

        Tempo tempo1 = new Tempo(tempoEmSegundos);
        tempo1.getTempo();

        entradaTeclado.close();
    }

}
class Tempo{
    private int horas;
    private int minutos;
    private int segundos;

    public Tempo (int tempoEmSegundos){
        this.horas = tempoEmSegundos / 3600;
        this.minutos = (tempoEmSegundos % 3600) / 60;
        this.segundos = tempoEmSegundos % 60;
    }

    public void getTempo(){
        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
    }

}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de segundos");
        Float segundos = Float.valueOf(scanner.nextLine());
        tempoFinal(segundos);

    }

    private static void tempoFinal(Float segundos) {
        int horas = (int) (segundos / 3600);
        segundos %= 3600;
        int minutos = (int) (segundos / 60);
        segundos %= 60;

        System.out.printf("%d horas %d minutos %.0f segundos", horas, minutos, segundos);
    }
}

/**
 * Problema "duracao"
 * Fazer um programa para ler uma duração de tempo em segundos, daí imprimir na tela esta duração no
 * formato horas:minutos:segundos.
 * Exemplo 1:
 * Digite a duracao em segundos: 300
 * 0:5:0
 * Exemplo 2:
 * Digite a duracao em segundos: 12506
 * 3:28:26
 * Exemplo 3:
 * Digite a duracao em segundos: 140811
 * 39:6:51
 */
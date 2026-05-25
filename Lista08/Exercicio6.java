import java.util.Scanner;

public class Exercicio6 {

    public static int converterHora(int hora) {

        if (hora == 0) {
            return 12;
        } else if (hora > 12) {
            return hora - 12;
        } else {
            return hora;
        }
    }

    public static char definirPeriodo(int hora) {

        if (hora < 12) {
            return 'A';
        } else {
            return 'P';
        }
    }

    public static void mostrarHora(int hora, int minuto) {

        int novaHora = converterHora(hora);
        char periodo = definirPeriodo(hora);

        System.out.print("Hora convertida: " + novaHora + ":");

        if (minuto < 10) {
            System.out.print("0");
        }

        System.out.println(minuto + " " + periodo + ".M.");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char continuar;

        do {

            System.out.print("Digite a hora (0 a 23): ");
            int hora = scanner.nextInt();

            System.out.print("Digite os minutos: ");
            int minuto = scanner.nextInt();

            mostrarHora(hora, minuto);

            System.out.print("Deseja converter outra hora? (S/N): ");
            continuar = scanner.next().charAt(0);

        } while (continuar == 'S' || continuar == 's');

        scanner.close();
    }
}
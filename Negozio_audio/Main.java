
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Benvenuto nel negozio di supporti audio!\nVuoi effettuare dei test su dei supporti audio di prova? (si/no)");
        Scanner scanner = new Scanner(System.in);
        String risposta = scanner.nextLine();
        if (risposta.equalsIgnoreCase("si")) {
            Supporto supporto = null;
            System.out.println("Test su supporti audio di prova:\nVuoi effettuare un test su un CD o su una Tape? (1:CD/2:Tape)");
            int scelta = scanner.nextInt();
            scanner.nextLine(); // Consuma il carattere di nuova riga rimasto nel buffer
            if (scelta == 1) {
                supporto = CDProva.getIstance();
            } else if (scelta == 2) {
                supporto = TapeProva.getIstance();
            } else {
                System.out.println("Scelta non valida. Uscita dal programma.");
            }
        }
        System.out.println("Vuoi Acquistare un supporto audio? (si/no)");
        String risposta2 = scanner.nextLine();
        if (risposta2.equalsIgnoreCase("si")) {
            Supporto supporto = null;
            System.out.println("Vuoi acquistare un CD o una Tape? (1:CD/2:Tape)");
            int scelta = scanner.nextInt();
            scanner.nextLine(); // Consuma il carattere di nuova riga rimasto nel buffer
            if (scelta == 1) {
                supporto = new CD();
            } else if (scelta == 2) {
                supporto = new Tape();
            } else {
                System.out.println("Scelta non valida. Uscita dal programma.");
            }
        }
    }
}

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Inserisci il tuo nome");
        String inputName = in.next();
        
        System.out.println("Inserisci il tuo cognome");
        String inputSurname = in.next();
        
        System.out.println("Qual'è il tuo colore preferito?");
        String inputColor = in.next();
        
        System.out.println("Inserisci la tua data di nascita");
        System.out.println("Giorno: ");
        int inputDay = in.nextInt();
        System.out.println("Mese:(numero)");
        int inputMonth = in.nextInt();
        System.out.println("Anno:");
        int inputYear = in.nextInt();

        System.out.println("La tua password sarà: " + inputName + "-" + inputSurname + "-" + inputColor + "-" + (inputDay + inputMonth + inputYear));
    }
}

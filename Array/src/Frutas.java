import java.util.Scanner;

public class Frutas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String[] frutas = new String[10];
        frutas[0] = "morango";
        frutas[1] = "maracujá";
        frutas[2] = "amora";
        frutas[3] = "bergamota";
        frutas[4] = "uva verde";
        frutas[5] = "abacaxi";
        frutas[6] = "pitanga";
        frutas[7] = "laranja";
        frutas[8] = "pêssego";
        frutas[9] = "maçã";

        for (int i = 0; i < frutas.length; i++) {
        System.out.println("Frutinhas <3");
        System.out.println(frutas[i]);

        }
    }
}

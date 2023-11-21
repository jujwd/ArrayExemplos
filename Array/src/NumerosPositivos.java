import java.util.Scanner;

public class NumerosPositivos { public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[10];

        for(int contador = 0; contador < numeros.length; contador ++) {
            System.out.println("Informe um número: ");
            numeros[contador] = teclado.nextInt();
        }

        for(int contador = 0; contador < numeros.length; contador ++) {
            System.out.println("Indice: "+contador+" Número: "+ numeros[contador]);

        }
    }
}



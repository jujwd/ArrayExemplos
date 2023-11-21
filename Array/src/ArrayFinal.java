
public class ArrayFinal {
    public static void main(String[] args) {
        int numeros1[] = {3, 6, 2, 7, 8};
        int numeros2[] = {2, 8, 7, 4, 5};

        System.out.println("Total de números pares: " + totalPares(numeros1));
        System.out.println("O maior número é: "+maiorValor(numeros1));
        System.out.println("Os números repetidos são: "+totalIguais(numeros1, numeros2));
    }

    public static int totalPares(int[] numeros) {
        int totalPares = 0;

        for (int contador = 0; contador < numeros.length; contador++) {
            if (numeros[contador] % 2 == 0) {
                totalPares++;
            }
        }
        return totalPares;
    }
    public static int maiorValor(int[] numeros){
        int maiorNumero = -1;

        for (int x = 0; x < numeros.length; x++) {
            if (x == 0 || numeros[x] > maiorNumero) {
                maiorNumero = numeros[x];
            }
        }
        return maiorNumero;
    }
    public static int totalIguais(int[] numeros1, int[] numeros2) {
        int iguais = 0;

        for (int y = 0; y < numeros1.length; y++) {
            if (verificaOcorencia(numeros1[y], numeros2));
            {
                iguais++;
            }
        }
        return iguais;
    }

    public static boolean verificaOcorencia(int numero, int[] numeros) {
        boolean find = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numero == numeros[i]) {
                find = true;
            }
        }
        return find;
    }














}

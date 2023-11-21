//*Alocar memória - Inicialização da variável array é obrigatória.

public class Exemplo1 {

    public static void main(String[] args) {

        String[] nomes = new String[5];
        nomes[0] = "Joao";
        nomes[1] = "Maria";

        System.out.println(nomes[0].toUpperCase());
        System.out.println(nomes[1].toUpperCase());
        System.out.println(nomes[2].toUpperCase());
        System.out.println(nomes[3].toUpperCase());
        System.out.println(nomes[4].toUpperCase());

    }
}

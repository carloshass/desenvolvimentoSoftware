import java.util.Scanner;

public class parouimpar {
    // Atributos, propriedades, variaveis globais

    // Funções e procedimentos
    public static String verificarParImpar(int n) {
        if (n % 2 == 0) {
            return "Par";

        } else {
            return "Impar";
        }
    }
    // Função principal

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        // codigo
        do {
            n = teclado.nextInt();
            if (n >= 0) {
                System.out.println(verificarParImpar(n));
            }

        } while (n >= 0);
        teclado.close();
    }
}
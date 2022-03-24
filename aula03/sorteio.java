import java.util.Random;

public class sorteio{



// atributos, variáveis e comandos globais

// funções e procedimentos

// rotina principal

public static void main(String[] args) {
    Random gerador = new Random();
    int c = 1;
    int soma = 0;
    int maiorN = 0;
    int menorN = 100;
    float media;
    while (c <= 10) {
        // ler o numero
        int n = 1 + gerador.nextInt(100);
        c++; // c += 1 ou c = c +1
        soma = soma + n; // soma += n;
       
        if(n > maiorN){
            maiorN = n;
        }

        if(n < menorN){
            menorN = n;
        }
        System.out.println(n);
        
        }
        
        System.out.println("A soma é: " + soma);
        System.out.println("A média é: " + (media = soma / 10f)); // verificar como mudar para float (f) ou (float)
        System.out.println("O maior número é: " + maiorN);
        System.out.println("O menor número é: " + menorN);

    }
}



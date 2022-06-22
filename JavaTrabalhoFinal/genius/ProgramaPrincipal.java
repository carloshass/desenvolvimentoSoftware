package genius;

import java.io.IOException;
import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sequencia sequencia = new Sequencia();
        int pontuacao = 0;

        boolean perdeu = false;
        int contator = 1;
        System.out.println("Bem vindo ao jogo Genius! Prepare-se");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clrscr();
        while (!perdeu) {
            if (contator != 1) {
                pontuacao += 5;
            }
            sequencia.adicionar();
            for (int i = 0; i < sequencia.size(); i++) {
                System.out.print(sequencia.get(i));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                clrscr();
            }
            System.out.print("\nRodada #" + contator + ": ");
            for (int i = 0; i < sequencia.size(); i++) {
                int numeroPressionadaPeloJogador = scanner.nextInt();
                if (sequencia.estaCorreta(i, numeroPressionadaPeloJogador)) {
                    clrscr();
                    continue;
                } else {
                    perdeu = true;
                }

            }
            contator++;

        }
        scanner.close();
        System.out.println("\nVoce errou a sequencia! Pontuação final: " + pontuacao);
    }

    public static void clrscr() {

        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime();
        } catch (IOException | InterruptedException ex) {
        }
    }

}
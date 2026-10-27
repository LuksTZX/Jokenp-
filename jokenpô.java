import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Random rd = new Random();
    static final int PONTOS_PARA_VENCER = 5;

    public static int lerInt() {
        while (true) {
            try {
                int numero = sc.nextInt();
                sc.nextLine();
                return numero;
            } catch (InputMismatchException e) {
                System.out.println("Digite apenas numeros!");
                sc.nextLine();
            }
        }
    }

    public static String nomeJogada(int jogada) {
        switch (jogada) {
            case 1: return "Pedra";
            case 2: return "Papel";
            default: return "Tesoura";
        }
    }

    public static void main(String[] args) {
        int pontosComputador = 0;
        int pontosJogador = 0;
        int jogador;

        do {
            System.out.println("1 - Pedra, 2 - Papel, 3 - Tesoura, 4 - Sair");
            jogador = lerInt();

            if (jogador < 1 || jogador > 4) {
                System.out.println("Escolha um numero de 1 a 4!");
                continue;
            }
            if (jogador == 4) {
                break;
            }

            int computador = rd.nextInt(3) + 1;
            System.out.println("Computador: " + nomeJogada(computador));
            System.out.println("Jogador: " + nomeJogada(jogador));

            if (jogador == computador) {
                System.out.println("Empate!");
            } else if ((jogador == 1 && computador == 3)
                    || (jogador == 2 && computador == 1)
                    || (jogador == 3 && computador == 2)) {
                pontosJogador++;
                System.out.println("Voce ganhou a rodada!");
            } else {
                pontosComputador++;
                System.out.println("Voce perdeu a rodada!");
            }

            System.out.println("Placar: voce " + pontosJogador + " X " + pontosComputador + " Computador");

            if (pontosJogador == PONTOS_PARA_VENCER) {
                System.out.println("Parabens, voce venceu a partida!");
                break;
            } else if (pontosComputador == PONTOS_PARA_VENCER) {
                System.out.println("O computador venceu a partida!");
                break;
            }
        } while (true);

        System.out.println("Fim de jogo!");
    }
}
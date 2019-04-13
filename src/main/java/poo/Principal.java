package poo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Robô robô = new Robô();

        Scanner teclado = new Scanner(System.in);

        String comandos = teclado.next().toUpperCase(); // toUpperCase para deixar todos os comandos em padrão maiúsculo.

        robô.converterComandos(comandos);

        System.out.println(robô.getPosicao_atual());
    }
}

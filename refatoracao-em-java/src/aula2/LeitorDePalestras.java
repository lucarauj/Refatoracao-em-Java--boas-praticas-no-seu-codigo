package aula2;

import java.util.Scanner;

public class LeitorDePalestras {

    Scanner scanner = new Scanner(System.in);
    private Palestra lerPalestra(Scanner scanner) {
        String linha = scanner.nextLine();
        int indiceDaDivisaoEntreNomeETempo = linha.lastIndexOf(' ');

        String nome = linha.substring(0, indiceDaDivisaoEntreNomeETempo);
        String tempoString = linha.substring(indiceDaDivisaoEntreNomeETempo + 1, linha.length() - 3);
        TempoDeDuracao duracao = LIGHTING_STRING.contains(tempoString)
                ? TempoDeDuracao.LIGHTING
                : new TempoDeDuracao(Integer.valueOf(tempoString));

        return new Palestra(nome, duracao);
    }

}

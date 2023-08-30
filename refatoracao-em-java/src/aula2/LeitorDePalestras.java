package aula2;

import java.util.Scanner;

public class LeitorDePalestras {

    Scanner scanner = new Scanner(System.in);
    private Palestra lerPalestra(Scanner scanner) {
        String linha = scanner.nextLine();
        int indiceDaDivisaoEntreNomeETempo = linha.lastIndexOf(' ');

        TempoDeDuracao duracao = LIGHTING_STRING.contains(lerTempoDeDuracaoDaPalestra(linha, indiceDaDivisaoEntreNomeETempo))
                ? TempoDeDuracao.LIGHTING
                : new TempoDeDuracao(Integer.valueOf(lerTempoDeDuracaoDaPalestra(linha, indiceDaDivisaoEntreNomeETempo)));

        return new Palestra(lerNomeDaPalestra(linha, indiceDaDivisaoEntreNomeETempo), duracao);
    }

    private static String lerTempoDeDuracaoDaPalestra(String linha, int indiceDaDivisaoEntreNomeETempo) {
        return linha.substring(indiceDaDivisaoEntreNomeETempo + 1, linha.length() - 3);
    }

    private static String lerNomeDaPalestra(String linha, int indiceDaDivisaoEntreNomeETempo) {
        return linha.substring(0, indiceDaDivisaoEntreNomeETempo);
    }

}

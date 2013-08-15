
import java.util.Random;

public class Randomica {

    private int numCaracter;
    private static Random random;

    public Randomica(int numCaracter) {
        numCaracter = numCaracter;
        random = new Random();

    }

    public void geraSeq() {

        String palavra = new String();
        int iteracoes = 100000;
        int tamanhoAlfabeto = Decrypt.alfabeto.length();

        for (int i = 0; i < iteracoes; i++) {
            palavra = (String.valueOf(Decrypt.alfabeto.charAt(random.nextInt(tamanhoAlfabeto))));
            palavra = palavra.concat(String.valueOf(Decrypt.alfabeto.charAt(random.nextInt(tamanhoAlfabeto))));
            palavra = palavra.concat(String.valueOf(Decrypt.alfabeto.charAt(random.nextInt(tamanhoAlfabeto))));
            palavra = palavra.concat(String.valueOf(Decrypt.alfabeto.charAt(random.nextInt(tamanhoAlfabeto))));
            for (int j = 0; j < numCaracter - 4; j++) {
                palavra = palavra.concat(String.valueOf(Decrypt.alfabeto.charAt(random.nextInt(tamanhoAlfabeto))));
            }
            System.out.println(palavra);
        }

        //busca hash trieMD5
    }
}

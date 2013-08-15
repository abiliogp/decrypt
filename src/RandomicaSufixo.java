
import java.util.Random;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vanderson
 */
public class RandomicaSufixo {

    private static int numCaracter;
    private static Random random;

    public RandomicaSufixo(int numCaracters) {
        numCaracter = numCaracters;
        random = new Random();

    }

    public void geraSeq() {

        String palavra = new String();
        int iteracoes = 1000;
        int tamanhoAlfabeto = Decrypt.alfabeto.length();
        for (int alfa = 0; alfa < tamanhoAlfabeto; alfa++) {
            //seta a primeira letra randomiza as outras
            for (int primeira = 0; primeira < iteracoes; primeira++) {
                palavra = String.valueOf(Decrypt.alfabeto.charAt(alfa));
                for (int j = 0; j < numCaracter - 1; j++) {
                    palavra = palavra.concat(String.valueOf(Decrypt.alfabeto.charAt(random.nextInt(tamanhoAlfabeto))));
                }
                System.out.println(palavra);
            }
            //seta a segunda letra randomiza as outras
            System.out.println("letra 2");
            for (int segunda = 0; segunda < iteracoes; segunda++) {
                palavra = String.valueOf(Decrypt.alfabeto.charAt(random.nextInt(tamanhoAlfabeto)));
                palavra = palavra.concat(String.valueOf(Decrypt.alfabeto.charAt(alfa)));
                for (int j = 0; j < numCaracter - 2; j++) {
                    palavra = palavra.concat(String.valueOf(Decrypt.alfabeto.charAt(random.nextInt(tamanhoAlfabeto))));
                }

                System.out.println(palavra);

            }
            System.out.println("letra 3");
            //seta a terceira letra randomiza as outras
            for (int segunda = 0; segunda < iteracoes; segunda++) {
                palavra = String.valueOf(Decrypt.alfabeto.charAt(random.nextInt(tamanhoAlfabeto)));
                palavra = palavra.concat(String.valueOf(Decrypt.alfabeto.charAt(random.nextInt(tamanhoAlfabeto))));
                palavra = palavra.concat(String.valueOf(Decrypt.alfabeto.charAt(alfa)));
                for (int j = 0; j < numCaracter - 3; j++) {
                    palavra = palavra.concat(String.valueOf(Decrypt.alfabeto.charAt(random.nextInt(tamanhoAlfabeto))));
                }

                System.out.println(palavra);

            }
            System.out.println("letra 4");
            //seta a quarta letra e randomiza as outras
            for (int segunda = 0; segunda < iteracoes; segunda++) {
                palavra = String.valueOf(Decrypt.alfabeto.charAt(random.nextInt(tamanhoAlfabeto)));
                palavra = palavra.concat(String.valueOf(Decrypt.alfabeto.charAt(random.nextInt(tamanhoAlfabeto))));
                palavra = palavra.concat(String.valueOf(Decrypt.alfabeto.charAt(random.nextInt(tamanhoAlfabeto))));
                palavra = palavra.concat(String.valueOf(Decrypt.alfabeto.charAt(alfa)));
                for (int j = 0; j < numCaracter - 4; j++) {
                    palavra = palavra.concat(String.valueOf(Decrypt.alfabeto.charAt(random.nextInt(tamanhoAlfabeto))));
                }

                System.out.println(palavra);

            }
            if (numCaracter == 5) {
                System.out.println("letra 5");
                //seta a quinta letra e randomiza as outras
                for (int segunda = 0; segunda < iteracoes; segunda++) {
                    palavra = String.valueOf(Decrypt.alfabeto.charAt(random.nextInt(tamanhoAlfabeto)));
                    palavra = palavra.concat(String.valueOf(Decrypt.alfabeto.charAt(random.nextInt(tamanhoAlfabeto))));
                    palavra = palavra.concat(String.valueOf(Decrypt.alfabeto.charAt(random.nextInt(tamanhoAlfabeto))));
                    palavra = palavra.concat(String.valueOf(Decrypt.alfabeto.charAt(random.nextInt(tamanhoAlfabeto))));
                    palavra = palavra.concat(String.valueOf(Decrypt.alfabeto.charAt(alfa)));
                    palavra = palavra.concat(String.valueOf(Decrypt.alfabeto.charAt(random.nextInt(tamanhoAlfabeto))));
                    System.out.println(palavra);

                }
            }
            if (numCaracter == 6) {
                System.out.println("letra 6");
                //seta a sexta letra e randomiza as outras
                for (int segunda = 0; segunda < iteracoes; segunda++) {
                    palavra = String.valueOf(Decrypt.alfabeto.charAt(random.nextInt(tamanhoAlfabeto)));
                    palavra = palavra.concat(String.valueOf(Decrypt.alfabeto.charAt(random.nextInt(tamanhoAlfabeto))));
                    palavra = palavra.concat(String.valueOf(Decrypt.alfabeto.charAt(random.nextInt(tamanhoAlfabeto))));
                    palavra = palavra.concat(String.valueOf(Decrypt.alfabeto.charAt(random.nextInt(tamanhoAlfabeto))));
                    palavra = palavra.concat(String.valueOf(Decrypt.alfabeto.charAt(random.nextInt(tamanhoAlfabeto))));
                    palavra = palavra.concat(String.valueOf(Decrypt.alfabeto.charAt(alfa)));
                    
                    System.out.println(palavra);

                }
            }

        }



        //busca hash trieMD5
    }
}

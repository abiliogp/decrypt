
public class Alfa1 {
	private int numCaracter;
	
	public Alfa1(int numCaracter){
		numCaracter = numCaracter;
	}

	public void geraSeq(){
		String palavra = new String ();
		for(int i = 0; i < Decrypt.consoantes.length(); i++){
			for(int j = 0; j < Decrypt.vocais.length(); j++ ){
				palavra = (String.valueOf(Decrypt.consoantes.charAt(i)));
				palavra = palavra.concat(String.valueOf(Decrypt.vocais.charAt(j)));
				palavra = palavra.concat(String.valueOf(Decrypt.consoantes.charAt(i)));
				palavra = palavra.concat(String.valueOf(Decrypt.vocais.charAt(j)));
				System.out.println(palavra);
			}
		}
		//busca hash trieMD5
	}
}

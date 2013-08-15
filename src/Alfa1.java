
public class Alfa1 {
	private int numCaracter;
	
	public Alfa1(int numCaracter){
		numCaracter = numCaracter;
	}

	public void geraSeq(){
		String palavra = new String ();
		for(int i = 0; i < Decrypt.consoantes.length; i++){
			for(int j = 0; j < Decrypt.vogais.length; j++ ){
				palavra = (String.valueOf(Decrypt.consoantes[i]));
				palavra = palavra.concat(String.valueOf(Decrypt.vogais[j]));
				palavra = palavra.concat(String.valueOf(Decrypt.consoantes[i]));
				palavra = palavra.concat(String.valueOf(Decrypt.vogais[j]));
				System.out.println(palavra);
			}
		}
		//busca hash trieMD5
	}
        
}

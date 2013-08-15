
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.TreeMap;

public class Decrypt {

    static TreeMap<String, String> trieMd5 = new TreeMap<String, String>();
    static char vogais[]= {'a','e','i','o','u'};
    static char consoantes[] ={'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
    static char numeros[] = {'0','1','2','3','4','5','6','7','8','9'};
    static char extras[]= {'!','@','#','$','%','&','*','(',')','_','-','+','=','[',']','{','}','?','/','|','>','<', 92};
    static String alfabeto=new StringBuilder().append("").append(vogais).append(consoantes).append(numeros).append(extras).toString();

    private static void loadMd5(String inputFileName) throws IOException {
        String line;
        BufferedReader bf = new BufferedReader(new FileReader(inputFileName));
        while (bf.ready()) {
            line = bf.readLine();
            trieMd5.put(line, "");
        }
    }
    
    public static void findHash(String str) throws NoSuchAlgorithmException{
    	MessageDigest md = MessageDigest.getInstance("MD5");  
    	BigInteger hash = new BigInteger(1, md.digest(str.getBytes()));  
    	String key = hash.toString(16);  
    	 
    	//System.out.println(str);
    	if(trieMd5.containsKey(key)){    		
    		System.out.println("Achou " + str + " hash " +  key); 
    	}
    }

    /**
     * @param args
     * @throws IOException
     * @throws NoSuchAlgorithmException 
     */
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        loadMd5("md5");
        System.out.println("Trie MD5 size " + trieMd5.size());
        //System.out.print("teste"+alfabeto+"\n");
       //Alfa1 alfa = new Alfa1(4);
        //alfa.geraSeq();
        RandomicaSufixo rand = new RandomicaSufixo(6);
        rand.geraSeq();
    }
}

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;


public class Decrypt {

    private static TreeMap<String, String> trieMd5 = new TreeMap<String, String>(); 
	
    private static void loadMd5(String inputFileName) throws IOException{
    	String line;
		BufferedReader bf = new BufferedReader(new FileReader(inputFileName));
		while (bf.ready()) {
			line = bf.readLine();
			trieMd5.put(line, "");
		}
    }
    
    /**
	 * @param args
     * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		loadMd5("md5");
		System.out.println("Trie MD5 size " + trieMd5.size());
	}

}

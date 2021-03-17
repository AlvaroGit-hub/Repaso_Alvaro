package marzo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class practicaED {
	
public static void main(String args[]) throws IOException {
		
		FileReader fr = null;
		String linea="";
		int counter=0;
		try {
			fr = new FileReader("C:\\Users\\Ceinmark\\eclipse-workspace\\Manejo de archivos\\src\\manejodearchivos\\java.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		BufferedReader br = new BufferedReader(fr);
		
		do {
			
			linea = br.readLine();
			if(linea !=null) {
				System.out.println(linea);
				counter  += linea.split(" ").length;
			
			}
		System.out.println(counter);
	}while(linea!=null);

}
}

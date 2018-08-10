package root;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CMD {
	public static void runcommande(String commande) {
		try 
        { 
            Process p=Runtime.getRuntime().exec("cmd /c cd Gen/bit && " + commande); 
            p.waitFor(); 
            BufferedReader reader=new BufferedReader(
                new InputStreamReader(p.getInputStream())
            ); 
            String line; 
            while((line = reader.readLine()) != null) 
            { 
                System.out.println(line);
            } 

        }
        catch(IOException e1) {e1.printStackTrace();} 
        catch(InterruptedException e2) {e2.printStackTrace();} 

      
    
	}

}

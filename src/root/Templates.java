package root;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Templates {
	private String html;
	private String css;

	public Templates() {
		html = openFile("src/assets/template.html");
		
		css = openFile("src/assets/template.css");
	
		
		
	}

   public String getHtml() {
		return html;
	}

	public String getCss() {
		return css;
	}

private String openFile(String path){
	   String rep = "";
	   try {
			BufferedReader reader = new BufferedReader(new FileReader(path));
			rep="";
			String line;
		    while ((line = reader.readLine()) != null)
		    {
		     rep=rep+line+"\n";
		    }
		   
		    reader.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   return rep;
	   
   }
   
}


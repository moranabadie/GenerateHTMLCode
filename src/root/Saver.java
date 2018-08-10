package root;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Saver {
	public static void save(String namefile, String content, String namedirectory){
		File directory = new File("Gen/"+namedirectory);
		if (!directory.exists()) {
			directory.mkdir();
		}
		try {
			PrintWriter writer = new PrintWriter("Gen/"+namedirectory + "/" + namefile,"UTF-8");
			writer.println(content);
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

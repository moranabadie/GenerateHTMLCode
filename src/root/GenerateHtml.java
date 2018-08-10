package root;

import java.io.IOException;

public class GenerateHtml {
  Templates template;
	public GenerateHtml() {
		template = new Templates ();
		
	}

	public void generate(){
		int i = 0;
		for(Screen screen : Screen.values()) {
			// ou i+=1 dans tt les languages
			i++;
			//System.out.println(screen.getH1());
			String rep = template.getHtml().replace("TITRE", screen.getH1());
			rep = rep.replace("CONTENT", screen.getP());
			rep = rep.replace("NAME", screen.getName());
			String nomcss = "page" + Integer.toString(i) + ".css";
			rep = rep.replace("FICHIERCSS", nomcss);
			String css = template.getCss().replace("COLORTITLE", screen.getColortitle());
			css = css.replace("COLORCONTENT", screen.getColorcontent());
			// vue que c'est une methode statique qui s'applique à 
			//tout les objets de la meme manière, on a pas besoin de créer
			//un objet

			Saver.save("page" + Integer.toString(i) + ".html",rep,"bit");
			Saver.save(nomcss,css,"bit");
			System.out.println(rep);
			CMD.runcommande("mkdir " + screen.getName());
		}
	}
}

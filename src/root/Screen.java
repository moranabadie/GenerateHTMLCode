package root;

public enum Screen {
	ECRAN1("NAME1","TITRE1","CONTENT 1", "red", "blue"),
	ECRAN2("NAME2","TITRE2","CONTENT2","green","black"),
	ECRAN3("NAME3","TITRE3","CONTENT3","yellow","red"),
	ECRAN4("NAME4","TITRE4","CONTENT4","blue","yellow");
	private String h1;
	private String p;
	private String colortitle;
	private String colorcontent;
	private String name;
	Screen(String name,String h1, String p, String colortitle, String colorcontent) {
		this.name = name;
		this.h1 = h1;
		this.p = p;
		this.colortitle = colortitle;
		this.colorcontent = colorcontent;
	}
	public String getName() {
		return name;
	}
	public String getH1() {
		return h1;
	}
	public String getP() {
		return p;
	}
	public String getColortitle() {
		return colortitle;
	}
	public String getColorcontent() {
		return colorcontent;
	}

}

package pisumo;

public class Schueler {
	private String Name;
	private String Nachname;
	private String Klasse;
	private int Tel;
	private int alter;
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getNachname() {
		return Nachname;
	}

	public void setNachname(String nachname) {
		Nachname = nachname;
	}

	public String getKlasse() {
		return Klasse;
	}

	public void setKlasse(String klasse) {
		Klasse = klasse;
	}

	public int getTel() {
		return Tel;
	}

	public void setTel(int tel) {
		Tel = tel;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}
	public void setSchueler(String Name, String Nachname, String Klasse, int Tel, int alter) {
		setName(Name);
		setNachname(Nachname);
		setKlasse(Klasse);
		setTel(Tel);
		setAlter(alter);
	}
	public String getInfos() {
		return getName() + getNachname() + getKlasse() + getTel() + getAlter(); 	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

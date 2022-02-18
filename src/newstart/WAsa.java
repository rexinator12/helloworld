package newstart;

public class WAsa {
 private String Name;
 private String Vorname;
 private String Street;
 private int zip;
 private String Place;
	public String getName() {
	return Name;
}
public void setName(String name) {
	this.Name = name;
}
public String getVorname() {
	return Vorname;
}
public void setVorname(String vorname) {
	this.Vorname = vorname;
}
public String getStreet() {
	return Street;
}
public void setStreet(String street) {
	this.Street = street;
}
public int getZip() {
	return zip;
}
public void setZip(int zip) {
	this.zip = zip;
}
public String getPlace() {
	return Place;
}
public void setPlace(String place) {
	Place = place;
}
public void setAdress(String Name, String Street, int zip, String Place) {
	setName(Name);
	setStreet(Street);
	setZip(zip);
	setPlace(Place);
}
public void getAdress() {
	
}
	public static void main(String[] args) {
		
		
	}

}



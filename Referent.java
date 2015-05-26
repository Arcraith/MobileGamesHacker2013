import java.util.ArrayList;


public class Referent {

	private String name;
	private String email;
	private String firma;
	private ArrayList<Workshop> workshops = new ArrayList<Workshop>();
	private ArrayList<Workshop> workshopAlsTeilnehmer = new ArrayList<Workshop>();
	
	public Referent(String name, String email, String firma) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.email = email;
		this.firma = firma;
	}
	
	public void leitet(Workshop workshop){
		workshops.add(workshop);
	}
	
	public void nimmtTeilAn(Workshop workshop){
		workshopAlsTeilnehmer.add(workshop);
	}
	
	public String toString(){
		String temp ="";
		String temp2="";
		
		for(int i = 0; i < workshops.size(); i++){
			temp += workshops.get(i).getBezeichnung() + ", ";
		}
		for(int i = 0; i < workshopAlsTeilnehmer.size(); i++){
			temp2 += workshopAlsTeilnehmer.get(i).getBezeichnung() + ", ";
		}
		
		return name + " leitet folgende Workshops: " + temp + " und besucht folgende Workshops: " + temp2;
		
	}
}

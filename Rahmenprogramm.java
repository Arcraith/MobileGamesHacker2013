import java.util.ArrayList;


public class Rahmenprogramm {

	private String bezeichnung;
	private String ort;
	private String zeit;
	private String datum;
	private ArrayList<Teilnehmer> teilnehmer = new ArrayList<Teilnehmer>();
	
	public Rahmenprogramm(String bezeichnung, String ort, String  zeit, String datum) {
		// TODO Auto-generated constructor stub
		this.bezeichnung = bezeichnung;
		this.ort = ort;
		this.zeit = zeit;
		this.datum = datum;
	}
	
	public void nimmtTeil(Teilnehmer teilnehmer){
		this.teilnehmer.add(teilnehmer);
	}
	
	public String toString(){
		String temp = "";
		for(int i = 0; i < teilnehmer.size(); i++){
			temp += teilnehmer.get(i).getName() + ", ";
		}
		
		return bezeichnung + " hat folgende Teilnehmer: " + temp;
	}
}

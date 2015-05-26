import java.util.ArrayList;


public class Teilnehmer {

	private String name;
	private String mail;
	private String status;
	private ArrayList<Workshop> workshops = new ArrayList<Workshop>();
	
	public Teilnehmer(String name, String mail, String status) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.mail = mail;
		this.status = status;
	}
	
	public void nimmtTeilAn(Workshop workshop){
		workshops.add(workshop);
	}
	
	public String toString(){
		String temp = "";
		for(int i = 0; i < workshops.size(); i++){
			temp += workshops.get(i).getBezeichnung() + ", ";
		}
		
		return name + " nimmt an folgenden Workshops teil: " + temp;
	}
	
	public String getName(){
		return name;
	}
}

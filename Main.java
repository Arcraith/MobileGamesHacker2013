
public class Main {

	public static void main(String[] args) {
		Teilnehmer ersterTeilnehmer = new Teilnehmer("Hendrik", "hendrik@masterblaster.de", "Student");
		Teilnehmer zweiterTeilnehmer = new Teilnehmer("Benjamin", "benjamin@derliebeelefant.de", "Mitglied");
		Teilnehmer dritterTeilnehmer = new Teilnehmer("Timo", "schlauerStudent@timo.de", "Nichtmitglied");
		
		Workshop hacking = new Workshop("mgh2013-1", "h4cki1ng4pros", "2015-05-26");
		Workshop coding = new Workshop("mgh2013-2","Coding Workshop", "2015-05-28");
		Rahmenprogramm disko = new Rahmenprogramm("Besuch der Disko", "Disko Entenhausen", "21:00", "2015-05-29");
		
		Referent ersterReferent = new Referent("Dr. Code", "coding@code.de", "Coding GmbH");
		
		ersterReferent.leitet(coding);
		ersterReferent.nimmtTeilAn(hacking);
		
		ersterTeilnehmer.nimmtTeilAn(hacking);
		ersterTeilnehmer.nimmtTeilAn(coding);
		
		zweiterTeilnehmer.nimmtTeilAn(coding);
		
		dritterTeilnehmer.nimmtTeilAn(hacking);
		
		disko.nimmtTeil(ersterTeilnehmer);
		
		System.out.println(ersterTeilnehmer);
		System.out.println(zweiterTeilnehmer);
		System.out.println(dritterTeilnehmer);
		
		System.out.println(disko);
		
		System.out.println(ersterReferent);
	}
}

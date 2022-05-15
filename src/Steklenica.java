// Avtor: Maks Štempihar

// Deklariramo javni razred
public class Steklenica{
	
	public String getVsebina() {
		return vsebina;
	}

	// Deklariramo lastnosti
	// primitivni podatkovni tipi
	private int kapaciteta; 			// v ml
	private int kolicinaVsebine;		// v ml
	private boolean jeOdprta;
	// deklariramo objekt z imenom vsebina razreda string
	private String vsebina;				
	
	// deklariramo javni konstruktor
	// ustvarimo zaprto steklenico
	// parametri: količnina, vrsta vsebine
	// vrača: nov objekt razreda Steklenica
	
	public Steklenica(int k, String v){
		
		// inicializiramo lastnosti
		kapaciteta = k;
		kolicinaVsebine = k;
		jeOdprta = false;
		vsebina = v;
		
		// izpišemo konzolo dogodek
		System.out.println("Ustvarjam steklenico prosternine" + kapaciteta + " ml z vsebino " + vsebina);
		
	}	
	
	// deklariramo metodo, ki zmanjša količino steklenice
		// parametri: jih ni
		// vrača: uspešnost odpiranja
	/**
	 * @param k je količina vsebine
	 * @param v je opis vsebine
	 */
	public boolean odpri(){
		
		// če je steklenica že odprta
		if(jeOdprta){
			System.out.println("Steklenica je že odprta!");
			return false;
		}
		// če je steklenica še zaprta
		else{
			System.out.println("Odpiram steklenico");
			jeOdprta = true;
			return true;
		}
	}
		// deklariramo metodo, ki zmanjša količino steklenice
		// parametri: Količina, ki jo želimo izprazniti
		// vrača: Količnina, ki je ostala
	public int izprazni(int k){
		
		// če je steklenica odprta
		if(jeOdprta == true){
		
			// če je v steklenici dovolj vsebine
			if(kolicinaVsebine >= k){
				// od količine vsebine odštejemo količino za praznenje
				kolicinaVsebine = kolicinaVsebine - k;
				System.out.println("Iz steklenice praznim " + k + " ml");
			}
			
			// če v steklenici ni dovolj vsebine
			else{ 
				// izpraznimo vse v steklenici
				kolicinaVsebine = 0;
				System.out.println("Steklenica je prazna!");
			}
		}
		// če je steklenica zaprta
		else{
			System.out.println("Steklenica je zaprta!");
		}
		// vrenemo količino, ki je ostala
		return kolicinaVsebine;
	}
	
	// getter metoda, ki vrne količino vsebine
	public int getKolicinaVsebine(){
		return kolicinaVsebine;
	}
	
	// getter metoda, ki vrne količino vsebine
	public int getKapaciteta(){
		return kapaciteta;
	}
}
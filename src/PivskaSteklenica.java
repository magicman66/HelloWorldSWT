// deklariramo javni razred PivskaSteklenica, ki razširja razred Steklenica(od nje podeduje vse lastnosti in metode)
// in implementira vmesnik AlkoholnaPijaca(pripisuje katere metode morajo biti implementirane)
public class PivskaSteklenica extends Steklenica implements AlkoholnaPijaca{
	
	// vse lastnosti, ki jih imajo ostale televizije
	// dodatne lastnosti, ki veljajo le za pivske steklenice
	private double stopnjaAlkohola; // v odstotkih
	private String proizvajalec;
	private String vrsta;
	private double temperatura;		// v sopinjah celzija
	
	// konstruktor
	// vhodi: Velikost steklenice
	// vrne: nov objekt tipa PivskaSteklenica
	public PivskaSteklenica(int k, String p, String s, double a){
		
		// pokličemo konstruktor razreda
		super(k, "Pivo");
		
		// pivo vzamemo iz hladilnika
		temperatura = 8.0;
		
		// inicializiramo dodatne lastnosti
		stopnjaAlkohola = a;
		proizvajalec = p;
		vrsta = s;
	}
	
	//konstruktor, ki ustvari pivsko steklenico v kateri ni piva
	public PivskaSteklenica(int k, String p){
		
		// pokličemo konstruktor razreda
		super(k, "Pivo");
	
		// inicializiramo dodatne lastnosti
		temperatura = 0.0;
		stopnjaAlkohola = 0.0;
		proizvajalec = "";
		vrsta = "";
	}
	
	
	// metoda ogreje pivo za določeno število stopinj
	// vhod: niz s temperaturo
	// izhod: / 
	// meče izjemo v primeru napake
	public void ogrej(String tempS) throws Exception{
		
		double tempD = 0.0; 
		
		// pretorim niz v double
		try{
			tempD = Double.parseDouble(tempS);
		}
		
		// če metoda parseDouble vrže izjemo 
		catch(Exception e){
			
			// izpišemo napako in vržemo izjemo nazaj
			System.out.println("Napaka pri pretvorbi:" + e.toString());
			throw new Exception(tempS + " Ni število!");
		}
		
		System.out.print("Pivo ogrevam iz " + temperatura);
		
		// če bi bila končna temperatura previsoka, vržemo izjemo
		if(temperatura + tempD >= 100.0){
			temperatura = 100.00;
			throw new Exception("Pivo je zavrelo!");
		}
		
		// če bi bila končna temperatura prenizka, vržemo izjemo
		if(temperatura + tempD <= 0.0){
			temperatura = 0.00;
			throw new Exception("Pivo je zmrznilo!");
		}
		
		// povečamo temperaturo piva
		temperatura += tempD;
		
		System.out.print(" na " + temperatura + " stopinj.");
	}
	
	// metoda vrne vsebino nalepke
	// vhod: /
	// vrne: podatki na nalepki
	public String getNalepka(){
		String ret = " === PIVO === \n";
		ret += " Vsebina: " + getKapaciteta() + " ml\n";
		ret += " Proizvajalec: " + proizvajalec + "\n";
		ret += " Vrsta: " + vrsta + "\n";
		ret += " Alkohol: " + stopnjaAlkohola + " %\n";
		ret += " ============ \n";
		return ret;
	}
	
	// getter metoda, ki vrne stopnjo alkohola
	public double getStopnjaAlkohola(){
		return stopnjaAlkohola;
	}
	
	// getter metoda, ki vrne proizvajalca
	public String getProizvajalec(){
		return proizvajalec;
	}
	
	// getter metoda, ki vrne vrsto
	public String getVrsta(){
		return vrsta;
	}
}
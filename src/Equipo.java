public class Equipo {
	private String nombret;
	private int años;
	private String localidad;
	private String division;
	
	//constructor
	Equipo(){
	}
	//getter y setter
	public void setNombret (String izena){
		nombret = izena;
	}
	
	public String getNombret(){
		return nombret;
	}

	public void setAños (int urteak){
		años = urteak;
	}
	public int getAños(){
		return años;
	}

	public void setLocalidad (String prem){
		localidad = prem;
	}
	public String getLocalidad(){
		return localidad;
	}
	
	public void setDivision (String div){
		division = div;
	}
	public String getDivision(){
		return division;
	}
}

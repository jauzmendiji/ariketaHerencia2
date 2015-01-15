public class Entrenador extends Equipo {

	//propiedades de la subclase
	public String nombree;
	public int edade;
	public boolean expprimera;
	
	//constructor
	Entrenador(){
	}
	//getter y setter
		public void setNombree(String izena){
			this.nombree=izena;
		}
		public String getNombree(){
			return nombree;
		}

		public void setEdade(int adina){
			this.edade=adina;
		}
		public int getEdade(){
			return edade;
		}

		public void setExpprimera(boolean expe){
			this.expprimera=expe;
		}
		public boolean getExpprimera(){
			return expprimera;
		}
}

public class Jugadores extends Equipo {

	//propiedades de la subclase
	public String nombrej;
	public int edadj;
	public String puesto;
	public boolean internacional;

	//constructor
	Jugadores(){
	}
	//getter y setter
		public void setNombrej(String izena){
			this.nombrej=izena;
		}
		public String getNombrej(){
			return nombrej;
		}

		public void setEdadj(int adina){
			this.edadj=adina;
		}
		public int getEdadj(){
			return edadj;
		}

		public void setPuesto(String demar){
			this.puesto=demar;
		}
		public String getPuesto(){
			return puesto;
		}

		public void setInternacional(boolean inter){
			this.internacional=inter;
		}
		public boolean getInternacional(){
			return internacional;
		}
}

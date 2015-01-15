public class Main {
	public static void main (String [ ] Args) {

	        Entrenador entrenador = new Entrenador ();
	        entrenador.setNombret("Real Sociedad");
	        entrenador.setAños(1909);
	        entrenador.setLocalidad("Donostia");
	        entrenador.setDivision("Primera");
	        entrenador.setNombree("David Moyes");
	        entrenador.setEdade(51);
	        entrenador.setExpprimera(true);

	        
	        System.out.print("--- Entrenador: ");
	        System.out.print("\nNombre: " + entrenador.getNombree());
	        System.out.print("\nEdad: " + entrenador.getEdade());
	        System.out.print("\nExperiencia en primera: " + entrenador.getExpprimera());
	        System.out.print("		--- Equipo: ");	
	        System.out.print("\nNombre: " + entrenador.getNombret());
   	        System.out.print("\nAño fundacion: " + entrenador.getAños());
   	        System.out.print("\nLocalidad: " + entrenador.getLocalidad());
   	        System.out.print("\nDivision actual: " + entrenador.getDivision());

	        Jugadores jugadores = new Jugadores();
	        jugadores.setNombret("Real Madrid");
	        jugadores.setAños(1902);
	        jugadores.setLocalidad("Madrid");
	        jugadores.setDivision("Primera");
	        jugadores.setNombrej("Cristiano Ronaldo");
	        jugadores.setEdade(29);
	       	jugadores.setPuesto("Extremo izquierdo");
	        jugadores.setInternacional(true);
	        
	        System.out.print("\n--- Jugador: ");
	        System.out.print("\nNombre: " + jugadores.getNombrej());
	        System.out.print("\nEdad: " + jugadores.getEdadj());
	        System.out.print("\nDemarcacion: " + jugadores.getPuesto());
	       	System.out.print("\nInternacional: " + jugadores.getPuesto());
	        System.out.print("		--- Equipo: ");	
	        System.out.print("\nNombre: " + jugadores.getNombret());
   	        System.out.print("\nAño fundacion: " + jugadores.getAños());
   	        System.out.print("\nLocalidad: " + jugadores.getLocalidad());
   	        System.out.print("\nDivision actual: " + jugadores.getDivision());

	        //Hashtable

	       /* Hashtable<String,String> otrosEspacios = new Hashtable<String,String>();

	        otrosEspacios.put("Playa", "Zurriola");
			otrosEspacios.put("Plaza", "Zumardi");
			otrosEspacios.put("Biblioteca", "Madalen");
			otrosEspacios.put("Hospital", "Edificio Gipuzkoa");


			System.out.print("\n\n--- Hashtable erabiltzen: \n");
			System.out.println(otrosEspacios.get("Playa"));
			System.out.println(otrosEspacios.get("Hospital"));*/
	        
	}
}

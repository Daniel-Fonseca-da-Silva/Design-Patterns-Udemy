package estruturalAdapter;

public class Principal {

	public static void main(String[] args) {
		
		TomadaDoisPinos tomada = new TomadaComum();
		 PlugueTresPinos plugue = new PlugueEuropeu();
		 
		 Adaptador adapter = new Adaptador(tomada);
		 plugue.conectar(adapter);
	}

}

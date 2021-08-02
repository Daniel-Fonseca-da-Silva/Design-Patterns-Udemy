package estruturalAdapter;

public class PlugueComum implements PlugueDoisPinos{

	public void conectar(TomadaDoisPinos tomada) {
		System.out.println("[PLUGUE] para uma tomada de 2 pinos.");
		tomada.fornecerEnergia();
	}

}

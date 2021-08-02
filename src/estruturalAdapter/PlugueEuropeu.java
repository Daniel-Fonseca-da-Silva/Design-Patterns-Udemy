package estruturalAdapter;

public class PlugueEuropeu implements PlugueTresPinos{

	public void conectar(TomadaTresPinos tomada) 
	{
		System.out.println("[PLUGUE] para uma tomada de 3 pinos.");
		tomada.fornecerEnergia();
	}
	
}

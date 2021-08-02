package estruturalAdapter;

public class Adaptador implements TomadaTresPinos{
	
	private TomadaDoisPinos tomada;
	
	public Adaptador(TomadaDoisPinos tomada)
	{
		this.tomada = tomada;
	}
	
	public void fornecerEnergia()
	{
		tomada.fornecerEnergia();
	}
}

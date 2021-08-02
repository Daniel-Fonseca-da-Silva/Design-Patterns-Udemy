package criacaoSingleton;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

@SuppressWarnings("serial")
public class Janela extends JFrame{
	
	// Cria um objeto do tipo nulo privado e estatico
	private static Janela janela = null;
	
	// Construtor privado
	private Janela()
	{
		setSize(350, 300);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLocationRelativeTo(this);
	}
	
	// O metodo para chamar
	public static Janela getJanela()
	{
		// Se a janela for nula entao cria a janela
		if(janela == null)
		{
			janela = new Janela();
		}
		// Senao retorne a janela
		return janela;
	}
	
}

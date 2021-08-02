package criacaoSingleton;


public class Principal {

	public static void main(String[] args) {
		
		// Janela newJanela = new Janela(); // Proibido so e permitido com o metodo 
		
		Janela j = Janela.getJanela();
		j.setVisible(true);
		
		// Mesma janela
		Janela j2 = Janela.getJanela();
		j2.setVisible(true);

	}

}

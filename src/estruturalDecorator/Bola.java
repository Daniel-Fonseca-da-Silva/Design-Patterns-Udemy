package estruturalDecorator;

public class Bola extends Decorator{
	
	public Bola(Arvore a) {
		super(a);
	}

	public void showEnfeites() {
		super.showEnfeites();
		System.out.print("Bola, ");
	}
	
}


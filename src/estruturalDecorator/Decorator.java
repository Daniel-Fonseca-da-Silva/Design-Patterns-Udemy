package estruturalDecorator;


public abstract class Decorator implements Arvore{
	
	private final Arvore arvore;
	
	public Decorator(Arvore arvore){
		this.arvore = arvore;
	}
	
	public void showEnfeites() {
		arvore.showEnfeites();
	}
}

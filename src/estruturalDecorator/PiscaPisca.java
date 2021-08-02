package estruturalDecorator;

public class PiscaPisca extends Decorator{
	
	public PiscaPisca(Arvore a)
	{
		super(a);
	}
	
	public void showEnfeites()
	{
		super.showEnfeites();
		System.out.println("Pisca pisca, ");
	}
}


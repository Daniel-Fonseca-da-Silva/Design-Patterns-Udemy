package estruturalComposite;

public class Principal {
	
	public static void main(String[] args) {
	
	// Programadores (Leaves) 
	Programador pJuniorJava = new Programador("Erick Gama", 12.445);
	Programador pSenioPhp = new Programador("Pablo Santos", 6.239);
	Programador pEstagiarioC = new Programador("Luan Silva", 1.239);
	
	// Gerentes	
	Gerente gProjeto = new Gerente("Marcos Lans", 13.985);
	Gerente gPMP = new Gerente("Maria Clara", 8.985);
	Gerente gUngly = new Gerente("Marcao Ungly", 15.985);
	
	// Exibe a estrutura de arvore
	
	// Marcelo Lans supersiona os programadores Erick e Pablo
	gProjeto.add(pJuniorJava);
	gProjeto.add(pSenioPhp);
	
	// Maria Clara supersiona o programadore Luan Silva
	gPMP.add(pEstagiarioC);
	
	// Marcao Ungly é a raiz da estrutura da arvore
	gUngly.add(gProjeto);
	gUngly.add(gPMP);
	gUngly.print();
	
	}
}

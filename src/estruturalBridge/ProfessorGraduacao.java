package estruturalBridge;

// Abstracao
public class ProfessorGraduacao extends Professor{

	public ProfessorGraduacao(Implementador imp)
	{
		super(imp);
	}

	public void op()
	{
		imp.opImpl();
	}

}

package estruturalBridge;

public class Principal {
	
	public static void main(String[] args) {
			
			Professor grad = new ProfessorGraduacao(new ProfessorImplGraduacao());
			grad.op();
		}
}

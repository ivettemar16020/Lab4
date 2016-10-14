/**
 * @author IvetteCardona 16020
 *
 */
public class DriverSoldado {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Soldado soldadito = new Soldado();
		Militar miMilitar = new Militar();
		Teniente teniente = new Teniente();
		General general = new General();
		Coronel coronel = new Coronel();
		
		soldadito.recibeOrden();
		general.planificaEstrategia();
		coronel.ejecutaOrdenManiobra();
		teniente.tomaOrdenCoronel("Tomando orden del Coronel");
		System.out.println("...");
		
		//Print de toda la informacion de las clases correspondientes
		System.out.println("INFO");
		System.out.println("Informacion del general: ");
		System.out.println("Horas: "+ miMilitar.getHoras());
		System.out.println("Salario" + miMilitar.getSalario());
		System.out.println("Dias de vacaciones: " + miMilitar.getDiasVacaciones());
		System.out.println("Formulario de vacaciones: " + miMilitar.getFormularioVacaciones());
		System.out.println("Informacion del Soldado: ");
		System.out.println("Horas: " + soldadito.getHoras());
		System.out.println("Salario: " + soldadito.getSalario());
		System.out.println("Dias de vacaciones: " + soldadito.getDiasVacaciones());
		soldadito.recibeOrden();
	}

}

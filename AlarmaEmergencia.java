/**
 * 
 */

/**
 * @author IvetteCardona22
 *
 */
public class AlarmaEmergencia extends AlarmaEjer2 {
	
	AlarmaEmergencia alarmaIncendio = new AlarmaEmergencia();
	public void m1() { 
		System.out.println("emergencia 1"); } // emergencia 1
	
	public void m2() {
		super.m1(); // alarma 1 
		super.m2(); // timbre 1 
		
	}
	
	public String toString(){// emergencia Ring...Ring...Ring...Ring
		return "emergencia" + super.toString();
	}
	
	
}

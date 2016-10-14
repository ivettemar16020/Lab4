/**
 * @author IvetteCardona 16020
 *
 */
public class AlarmaEjer2 extends Timbre {
	public void m1() { 
		System.out.println("alarma 1"); } 
	public void m2() { 
		super.m1(); } 
	public String toString() { 
		return super.toString() + "…" + super.toString(); }
}

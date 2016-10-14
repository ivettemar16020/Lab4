/**
 * @author IvetteCardona 16020
 *
 */
public class Soldado extends Militar{
    /**
     * @return Horas del militar
     */
    public int getHoritas() {
        return super.getHoras() *2;          // trabaja 80 horas / semana, el doble de los militares
    }
    /**
     * @return Salario del militar
     */
    public double getSalarioSold() {
        return super.getSalario() - 10000;     // Q30,000.00 / anio, 10 000 menos que los militares
    }
    /**
     * @return Cant dias de vacaciones del militar
     */ 
    public int getDiasVacaciones() {
        return super.getDiasVacaciones() / 2;           // 1 semana de vacaciones pagadas, la mitad de los militares
    }

    public void recibeOrden() {
    	 System.out.println("Ordene mi General!"); //Imprime el dialgo pertinente
    }
	
}

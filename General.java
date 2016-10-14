/**
 * @author IvetteCardona 16020
 *
 */

// CC2006, Lab 4
// Una clase para representar a los Generales.

public class General extends Militar {
    /* (non-Javadoc)
     * @see Militar#getDiasVacaciones()
     */
    public int getDiasVacaciones() {
        return super.getDiasVacaciones() + 5;           // 3 semanas de vacaciones
    }

    /* (non-Javadoc)
     * @see Militar#getFormularioVacaciones()
     */
    public String getFormularioVacaciones() {
        return "rosado";
    }
    
    public void planificaEstrategia() {
        System.out.println("Llevaremos tres divisiones a la frontera!"); //Imprimir
    }
}

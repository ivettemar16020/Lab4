/**
 * @author IvetteCardona 16020
 *
 */
// CC2006, Lab 4
// Una clase para representar a los militares en general.

public class Militar {
    /**
     * @return horas del militar 
     */
    public int getHoras() {
        return 40;           // trabaja 40 horas / semana
    }
    /**
     * @return salario del militar 
     */
    public double getSalario() {
        return 40000.0;      // Q40,000.00 / anio
    }
    /**
     * @return cant dias de vacacciones del militar 
     */
    public int getDiasVacaciones() {
        return 10;           // 2 semanas de vacaciones pagadas
    }

    /**
     * @return amarillo
     */
    public String getFormularioVacaciones() {
        return "amarillo";     // use el formulario amarillo
    }
}

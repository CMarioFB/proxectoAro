package Aro;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 * @author A21CarlosFB
 */
public class Aro {

    /**
     * @return the coordenadaX obtener valor de coordenadaX
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * @param coordenadaX the coordenadaX to set
     * modificar valor coordenadaX
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     * @return the coordenadaY 
     * obtener el valor de la coordenada Y
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * @param coordenadaY the coordenadaY to set
     * modificar valor de coordenada Y
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     * @return the radio obtener el valor del radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     * modificar el valor del radio
     */
    public void setRadio(double radio) {
        this.radio=(radio < MINIMO ? MINIMO : radio);
        
    }

    private static double LIMITERADIO = 0.0;
    /** constante MINIMO establece o valor limite do radio  **/
    
    public static final double MINIMO = getLIMITERADIO();

    private int coordenadaX;
    private int coordenadaY;
    private double radio;

    /** constructor vacio **/
    
    public Aro() {
    }

    /**
     * 
     * @param valorX
     * @param valorY
     * @param valorRadio
     */
    public Aro(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        setRadio(valorRadio);
    }

    /**
     *
     * @return obtener el valor del diametro do aro
     */
    public double obterDiametro() {
        return getRadio() * 2;
    }
/**
 * 
 * @return valor da circunferencia
 */
   
    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    /**
     *
     * @return valor da superficie
     */
    public double obterSuperficie() {
        return Math.PI * getRadio() * getRadio();
    }
    /**
     * detalla o aro seu Centro (coordenadas x e y) e seu radio
     * @return 
     */
    @Override
    public String toString() {
        return "Centro = [" + getCoordenadaX() + "," + getCoordenadaY() + "]; Radio = " + getRadio();
    }
/** trasladamos o centro do circulo movendo coordenadas X e Y
     * @param trasladarX
     * @param trasladarY **/
    
    public void trasladarCentro(int trasladarX, int trasladarY){
        setCoordenadaX(getCoordenadaX() + trasladarX);
        setCoordenadaY(getCoordenadaY() + trasladarY);
    }
    /**
     * @return the LIMITERADIO
     */
    public static double getLIMITERADIO() {
        return LIMITERADIO;
    }

    /**
     * @param aLIMITERADIO the LIMITERADIO to set
     */
    public static void setLIMITERADIO(double aLIMITERADIO) {
        LIMITERADIO = aLIMITERADIO;
    }
}
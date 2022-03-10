package Aro;

import java.text.DecimalFormat;

/**
 * Pruebas de refactorización en NetBeans con la clase Aro
 * @author A21CarlosFB
 */
public class Main {

    /**
     *
     * @param args
     * método main do Proxecto
     * Onde calculase o diámetro, a circuferencia e a área do círculo
     * Xeramos un obxeto circulo da clase Aron cos valores:
     *   x=37 y =43 e radio=2,5
     * Facemos a saida destes valores
     * modificamos os valores a:
     * x=35 y=20 radio= 4,2
     * 
     * Creamos un objeto para salida con 2 dig decimales
     * e mostramos o diametro a circunferenica e o circulo
     * cos valores modificados
     * 
     */
    public static void main(String[] args) {
        Aro circulo = new Aro(37,43,2.5);
        String saida =
                "A coordenada X é "+circulo.getCoordenadaX()+
                "\nA coordenada Y é "+circulo.getCoordenadaY()+
                "\nO radio é "+circulo.getRadio();
        circulo.setCoordenadaX(35);
        circulo.setCoordenadaY(20);
        circulo.setRadio(4.2);
        DecimalFormat dousDixitos = new DecimalFormat("0.00");
        saida+="\nO diámetro é "+dousDixitos.format(circulo.obterDiametro());
        saida+="\nA circunferencia é "+dousDixitos.format(circulo.obterCircunferencia());
        saida+="\nA área é "+dousDixitos.format(circulo.obterSuperficie());
        System.out.println(saida);
        
        System.out.println(saida);
        System.exit(0);
    }

}
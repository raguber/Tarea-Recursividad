
/**
 * Solución del problema 2
 *
 * @author (Juan José Bermúdez Vargas B71082 & Randy Aguero B90082)
 * @version (17.06.2021)
 */

import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Problema2
{
    
    /**
     * Método que calcula el valor de cuadrado(n).
     * @param n valor ingresado por el usuario de n
     */
    public int cuadr (int n)
    {
        if (n>1)
        {
            return cuadr(n-1) + n + n - 1;
        }
        return 1;
    }
    
    public static void main (String arg [])
    {
        int n = 0;
        boolean invalid = true;
        while(invalid) {
            try {
                String s = (String) (JOptionPane.showInputDialog(null,"Ingrese el número"));
                n = Integer.parseInt(s);
                invalid = false;
                if (n < 1) {
                    JOptionPane.showMessageDialog(null,"¡El número debe ser un entero positivo!");
                    invalid = true;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"¡Ingrese un número válido!");
            }
        }
        
        Problema2 p2 = new Problema2 ();
        JOptionPane.showMessageDialog(null,"El resultado de cuadr(" + n + ") es " + p2.cuadr(n));
    }
}

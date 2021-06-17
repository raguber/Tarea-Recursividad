
/**
 * Solución del problema 3
 *
 * @author (Juan José Bermúdez Vargas & Randy Aguero B90082)
 * @version (17.06.2021)
 */

import javax.swing.JOptionPane;
public class Problema3A
{
    /**
     * Método que halla el inverso simple de una hilera
     * @param sec = hilera a invertir
     * @param lastChar = caracter del llamado previo al método
     * @param start = booleano que indica si es el primer llamado al método
     */
    public String halleInverso (String sec, char lastChar, boolean start)
    {
        if (sec.equals(""))
        {
            return "";
        }
        
        char newChar = sec.charAt(sec.length()-1);
        String newSec = "";
        for (int i = 0; i<sec.length()-1; i++)
        {
            newSec += sec.charAt(i);
        }
        if ((newChar != lastChar) || (start == true))
        {
            return newChar + halleInverso(newSec,newChar,false);
        }
        if (newChar == lastChar)
        {
            return halleInverso(newSec,newChar,false);
        }
        return halleInverso (newSec,newChar,false);
    }
    
    public static void main (String arg [])
    {
        String msg = JOptionPane.showInputDialog(null,"Ingrese mensaje para calcular su inverso.");
        Problema3A p3 = new Problema3A();
        JOptionPane.showMessageDialog(null,"Mensaje original: " + msg + "\nMensaje invertido: " + p3.halleInverso(msg,'a',true));
    }
}

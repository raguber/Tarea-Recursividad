
/**
 * Solución del problema 3.
 *
 * @author (Juan José Bermúdez Vargas & Randy Aguero)
 * @version (17.06.2021)
 */

import javax.swing.JOptionPane;
public class Problema3B
{
    public String quiteRepetidos (String sec, char lastChar, boolean start)
    {
        if (sec.equals(""))
        {
            return "";
        }
        char newChar = sec.charAt(0);
        String newSec = "";
        for (int i = 1; i<sec.length(); i++)
        {
            newSec += sec.charAt(i);
        }
        if (start || newChar != lastChar)
        {
            return newChar + quiteRepetidos(newSec,newChar,false);
        }
        return quiteRepetidos(newSec,newChar,false);
    }
    
    public String inviertaHilera (String msg)
    {
        if (msg.equals(""))
        {
            return "";
        }
        String newMsg = "";
        for (int i = 0; i<msg.length()-1; i++)
        {
            newMsg += msg.charAt(i);
        }
        return msg.charAt(msg.length()-1) + inviertaHilera(newMsg);
    }
    
    public static void main (String arg [])
    {
        String msg = JOptionPane.showInputDialog(null,"Ingrese mensaje para calcular su inverso.");
        Problema3B p3 = new Problema3B();
        JOptionPane.showMessageDialog(null,"Mensaje original: " + msg + "\nMensaje invertido: " + p3.inviertaHilera(p3.quiteRepetidos(msg,'a',true)));
    }
}

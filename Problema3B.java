
/**
 * Solución del problema 3.
 *
 * @author (Juan José Bermúdez Vargas & Randy Aguero B90082)
 * @version (17.06.2021)
 */


public class Problema3B
{
    EntradaDatos entrada;
    public Problema3B()

    {
        entrada = new EntradaDatos();
    }
    public String quiteRepetidos (String sec, char caracterUltimo, boolean start)
    {
        if (sec.equals(""))
        {
            return "";
        }
        char nuevoCaracter = sec.charAt(0);
        String nuevaSecuencia = "";
        for (int i = 1; i<sec.length(); i++)
        {
            nuevaSecuencia += sec.charAt(i);
        }
        if (start || nuevoCaracter != caracterUltimo)
        {
            return nuevoCaracter + quiteRepetidos(nuevaSecuencia,nuevoCaracter,false);
        }
        return quiteRepetidos(nuevaSecuencia,nuevoCaracter,false);
    }
    
    public String inviertaHilera (String hil)
    {
        if (hil.equals(""))
        {
            return "";
        }
        String nuevaHilera= "";
        for (int i = 0; i<hil.length()-1; i++)
        {
            nuevaHilera+= hil.charAt(i);
        }
        return hil.charAt(hil.length()-1) + inviertaHilera(nuevaHilera);
    }
    public String pedirHilera()
    {
        String hilera = "";
        String mensaje = ("Escriba un texto");
        hilera = entrada.pedirTexto(mensaje);
        return hilera;
    }

    
    public static void main (String arg [])
    {
        Problema3B problema = new Problema3B();
        String hilera = problema.pedirHilera();
        System.out.println("Se muestra mensaje invertido");
        String hileraInvertida = problema.inviertaHilera(problema.quiteRepetidos(hilera,'a',true));
        System.out.println(hileraInvertida);
    }
}

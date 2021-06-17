/**
 * Solución del problema 1
 *
 * @author (Juan José Bermúdez Vargas B71082 & Randy Aguero B90082)
 * @version (17.06.2021)
 */
public class Problema1
{
    EntradaDatos entrada;
    int numA;
    int numB;
    String registroExplosiones;
    
    public Problema1()
    {
        entrada = new EntradaDatos();
        registroExplosiones = "";
    }

    public int pedirNumero()
    {
        String mensaje = "";
        
        mensaje = ("Digite un numero A:");
        numA = entrada.pedirNumero(mensaje,0);
       
        mensaje = ("Digite un numero B mayor o igual a 2");
        numB = entrada.pedirNumero(mensaje,1);//Se le solicita un numero mayor o igual a 2 para que no suceda una cadena infinita
  
        return numA;
    }

    public void explote(int n)
    {
        
        if(numB>=n)
        {
            registroExplosiones += (n/numB);
        }
        else
        {
            int n1 = (n/numB);
            explote(n1);
            
            int n2 = (n-(n/numB));
            explote (n2);
        }
       
    }

    public void mostrarRegistroExplosiones()
    {
        System.out.println("Se presentan las explosiones "+registroExplosiones);
    }

    public static void main (String args[])
    {
        Problema1 problema = new Problema1();
        int numA = problema.pedirNumero();
    
        problema.explote(numA);
        problema.mostrarRegistroExplosiones();
    }

}


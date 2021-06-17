/**
 * Solución del problema 1
 *
 * @author (Juan José Bermúdez Vargas B71082 & Randy Aguero B90082)
 * @version (17.06.2021)
 */
public class Problema1
{
    EntradaDatos entrada = new EntradaDatos();
    int numA;
    int numB;
    String registroExplosiones;
    public Problema1()
    {
        entrada = new EntradaDatos();
        registroExplosiones ="";
    }

    public int pedirNumero()
    {
        String mensaje = "";
        boolean numAmenorNumB = true;
        while(numAmenorNumB)
        {
            mensaje = ("Digite un numero A mayor que 2:");//Se pide mayor que 2 para que numA sea posible mayor que B
            numA = entrada.pedirNumero(mensaje,2);
           
            mensaje = ("Digite un numero B menor que numero A, numero A es"+numA);
            numB = entrada.pedirNumeroRango(mensaje,numA,1);//Se le solicita un numero menor que numA, para que se cumbla n>b-----
  
            if(numA>numB)
            {
                numAmenorNumB = false;
            }
        }
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

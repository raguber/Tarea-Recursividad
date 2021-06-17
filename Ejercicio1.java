
public class Ejercicio1
{
    EntradaDatos entrada = new EntradaDatos();
    int numA;
    int numB;
    String registroExplosiones;
    public Ejercicio1()
    {
        entrada = new EntradaDatos();
        registroExplosiones ="";
    }

    public void pedirNumero()
    {
        String mensaje = "";
        boolean numAmenorNumB = true;
        while(numAmenorNumB)
        {
            mensaje = ("Digite un numero A mayor que 2:");//Se pide mayor que 2 para que numA sea posible mayor que B
            numA = entrada.pedirNumero(mensaje,2);
            System.out.println(numA);
            mensaje = ("Digite un numero B menor que numero A, numero A es"+numA);
            numB = entrada.pedirNumeroRango(mensaje,numA,1);//Se le solicita un numero menor que numA, para que se cumbla n>b-----
            System.out.println(numB);
            if(numA>numB)
            {
                numAmenorNumB = false;
            }
        }
    }

    public void hacerExplosion()
    {
    
        if(numB>=numA)
        {
            registroExplosiones += ("( numA / numB :"+(numA/numB)+")"); 
            mostrarRegistroExplosiones();
        }
        else
        {
            System.out.println(numA);
            numA = (numA-(numA/numB));
            System.out.println(numB);
            registroExplosiones += ("( Explosion en cadena, num A ="+numA+" numB ="+numB+")");
             hacerExplosion();
        }
       
    }

    public void mostrarRegistroExplosiones()
    {
        System.out.println("Se presentan las explosiones"+registroExplosiones);
    }

    public static void main (String args[])
    {
        Ejercicio1 ejercicio = new Ejercicio1();
        ejercicio.pedirNumero();
        ejercicio.hacerExplosion();

    }

}

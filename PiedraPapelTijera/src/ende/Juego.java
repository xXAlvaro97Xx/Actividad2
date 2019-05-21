package ende;

/**
 * author Alvaro Colas Martinez
 * Simula el juego de Piedra, Papel o tijera
 */


public class Juego 
{
    public static void main(String args[])
    {
        Jugador p1=new Jugador();
        Jugador p2=new Jugador();
        boolean findejuego=false;  
        Integer Rondasjugadas = 0;    // Numero de rondas jugadas
        Integer EXITOSjugador1=p1.exitos;
        Integer EXITOSjugador2=p2.exitos;
        Integer EmPaTeS = 0;
        String opcionJUGADOR1;
        String opcionJUGADOR2;
        
        // Bucle de juego
        do
        {
            System.out.println("***** Ronda: " + Rondasjugadas+" *********************\n");
            System.out.println("Numero de empates: "+ EmPaTeS + "\n");
            opcionJUGADOR1=p1.opcion_al_azar();
            System.out.println("Jugador 1: " + opcionJUGADOR1+"\t Jugador 1 - Partidas ganadas: " + EXITOSjugador1);
            opcionJUGADOR2 = p2.opcion_al_azar();
            System.out.println("Jugador 2: " + opcionJUGADOR2+"\t Jugador 2 - Partidas ganadas: " + EXITOSjugador2);
            
            if((opcionJUGADOR1.equals("piedra"))&&(opcionJUGADOR2.equals("papel")))
            {
                System.out.println("Jugador 2 GANA");
                EXITOSjugador2 = ++p2.exitos;
                
            }
            else if((opcionJUGADOR1.equals("papel"))&&(opcionJUGADOR2.equals("piedra")))
            {
            	EXITOSjugador1 = ++p1.exitos;
                System.out.println("Jugador 1 GANA");
            }
            else if((opcionJUGADOR1.equals("piedra"))&&(opcionJUGADOR2.equals("tijeras")))
            {
            	EXITOSjugador1 = ++p1.exitos;
                System.out.println("Jugador 1 GANA");
            }
            else if((opcionJUGADOR1.equals("tijeras"))&&(opcionJUGADOR2.equals("piedra")))
            {
            	EXITOSjugador2 = ++p2.exitos;
                System.out.println("Jugador 2 GANA");
            }
            else if((opcionJUGADOR1.equals("tijeras"))&&(opcionJUGADOR2.equals("papel")))
            {
            	EXITOSjugador1 = ++p1.exitos;
                System.out.println("Jugador 1 GANA");
            }
            else if((opcionJUGADOR1.equals("papel"))&&(opcionJUGADOR2.equals("tijeras")))
            {
            	EXITOSjugador2 = ++p2.exitos;
                System.out.println("Jugador 2 GANA");
            }
            if(opcionJUGADOR1==opcionJUGADOR2)
            {
            	EmPaTeS++;
                System.out.println("\n\t\t\t Empate \n");
            }
            Rondasjugadas++;
            if((p1.exitos>=3)||(p2.exitos>=3))
            {
            	findejuego=true;
                System.out.println("FIN DEL JUEGO!!");
            }
            System.out.println();
        } while(findejuego!=true);
    }
}
/**
 *
 */
class Jugador{
   
    /**
     * Escoge piedra, papel o tijera al azar
     */
    public String opcion_al_azar()
    {
        String opcion="";
        Integer c = (int)(Math.random()*3);
        switch(c){
            case 0:
            	opcion=("piedra");
                break;
            case 1:
            	opcion=("papel");
                break;
            case 2:
            	opcion=("tijeras");
        }
        return opcion;
    }
    public void setExitos() 
    {
        exitos++;
    }
    public int getExitos() 
    {
        return(exitos);
    }
    
    int exitos;      // numero de partidas ganadas
    int winTotal;
}

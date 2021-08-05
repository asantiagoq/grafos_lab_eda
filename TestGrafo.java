import java.util.Scanner;

public class TestGrafo {
	public static void main (String[] args)
    {
    	Scanner scan = new Scanner(System.in);
    	int ini=0;
 
	    do
	  	{
	  	Grafo G=new Grafo();
    	G.insert();
    	G.muestra();
    	G.conexo();
    	G.grado();
    	System.out.println("Desea buscar un camino en este grafo \n1.-SI\n2.-NO");
    	int resp=scan.nextInt();
    	if(resp==1)
    	{
    		System.out.println("Ingrese el vertice de partida");
    		int i=scan.nextInt();
    		System.out.println("Ingrese el vertice a llegar");
    		int j=scan.nextInt();
    		G.recorrido(i,j);
    	}
    	System.out.println("\nDesea introducir otro grafo \n1.-SI\n2.-NO");
		 ini=scan.nextInt();
		}while(ini==1);
	}

}

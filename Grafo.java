import java.util.*;
public class Grafo {
	private int list1[][];
	private int list2[][];
 
    public Grafo() {
    	this.list1= new int [6][6];
    	this.list2= new int [6][6];
    }
 
    public void insert()
    {
    	Scanner val = new Scanner(System.in);
    	int size=0;
 
    	for (int i=1;i<=5;i++)
    	{
    		System.out.println("Da el numero de vertices adyasentes al vertice "+i+" :");
    		size = val.nextInt();
 
 
    		if(size!=0 && size<=5)
    		{
    			System.out.println("Da los vertices adyasentes: ");
    			for(int j=1;j<=size;j++)
    			{
    				int dato=val.nextInt();
    				list1[i][dato]=1;
    			}
    		}
    		else
    		{
    			if(size>5)
    				System.out.println("No pueden ser el numero dado");
    		}
 
 
    	}
    }
 
    public void muestra()
    {
    	System.out.println("\nEsta es la matriz de adyacencia");
    	for(int i=1;i<=5;i++)
    	{
    		for(int j=1;j<=5;j++)
    		{
    			System.out.print(" "+list1[i][j]);
    		}
    		System.out.print("\n");
    	}
    }
 
    public void conexo()
    {
    	
    	boolean a;
    	int cont=0;
    	for(int i=1;i<=5;i++)
    	{
    		a=false;
    		for(int j=1;j<=5;j++)
    		{
    			if (list1[i][j]==1)
    			a=true;
     		}
 
     		if (a==true)
     			cont=cont+1;
    	}
 
    	if (cont==5)
    		System.out.println("\nEl grado es conexo");
    	else
    		System.out.println("\nEl grafo no es Conexo");
    }
 
    public void grado()
    {
     	int c[]=new int  [6];
    	int cont=0;
 
    	for(int i=1;i<=5;i++)
    	{
    		cont=0;
    		for(int j=1;j<=5;j++)
    		{
    			if (list1[i][j]==1 || list1[j][i]==1)
    			cont=cont+1;
     		}
		c[i]=cont;
    	}
 
    	for(int i=1;i<=5;i++)
    	{
    		System.out.println("grado total del vertice "+i+" es: "+c[i]);
    	}
    }
 
    public void multiplica(int x)
    {
    		int c[][]=new int[6][6];
    		int j, i, k;
    	if (x<=2)
    	{
    		for(i=1; i<=5; i++)
		      {
		          for(j=1; j<=5;j++)
		             {
		                for(k=1; k<=5; k++)
		                   {
		                         list2[i][j]=list2[i][j]+(list1[i][k]*list1[k][j]);
		                   }
		              }
		      }
	    }
	    else
	    {
		    for(i=1; i<=5; i++)
		      {
		          for(j=1; j<=5;j++)
		             {
		                for(k=1; k<=5; k++)
		                   {
		                         c[i][j]=c[i][j]+(list1[i][k]*list2[k][j]);
		                   }
		              }
		      }
		      this.list2=c;
	    }
    }
 
    public void recorrido(int i, int j)
    {
    	boolean a=false;
    	int cont=0;
 
    	while(a==false && cont<5)
    	{
    		cont=cont+1;
    		if (cont==1)
    		{
    			if(list1[i][j]==1)
    			{
    				System.out.println("El camino de "+i+" a "+j+" es de longitud: "+cont);
    				a=true;
    			}
    		}
    		else
    		{
    			multiplica(cont);
    			if(list2[i][j]!=0)
    			{
    				System.out.println("El camino de "+i+" a "+j+" es de longitud: "+cont);
    				a=true;
    			}
    		}
    	}
    	if (a==false)
    		System.out.println("NO existe camino de "+i+" a "+j);
    }
 
}

package variables;
public class variables {

	public static void main(String[] args) {
		//  
		
		// ------FASE 1 -------------------------------------
                System.out.println("FASE 1 -------------------------------------- " );		
		String nom="Francesc";
		String cognom1="Nohales";
		String cognom2="Garcia";
		Integer dia=20;
		Integer mes=9;
		Integer any=1970;
		System.out.println(cognom1+" "+cognom2+" "+nom);
		System.out.println(dia+"/"+mes+"/"+any);
		
		// ------- FASE 2 --------------------------------------
                System.out.println("FASE 2 -------------------------------------- " );						
		Integer frequencia=10;
		final int any_traspaso=1948;
		Integer diferencia=0;
		diferencia=(any-any_traspaso)/frequencia;
		System.out.println("El numero d'anys de trasp�s entre l'any de naixement: "+ any + " y el any de trasp�s "+any_traspaso+ " �s de "+ diferencia );
		
		
		// ----- FASE 3 --------------------------------------
		System.out.println("FASE 3 -------------------------------------- " );
                String si_traspas="L'any de naixement �s de trasp�s";
		String no_traspas="L'any de naixement no �s de trasp�s"; 
		Boolean traspaso=false;
		
		for ( int x = any_traspaso; x <= any ;x=x+frequencia) {
			System.out.println("El any "+ x + " �s de trasp�s" );
                        if (x == any )traspaso=true; 
                	}
                
		if (traspaso) {
                    System.out.println( si_traspas  );
                }else{
                    System.out.println( no_traspas  );
                }
                
                // FASE 4 --------------------------------------
                System.out.println("FASE 4 -------------------------------------- " );
                String nomcomplet;
                String datacompleta;
                nomcomplet=nom+" "+cognom1+" "+cognom2;
                datacompleta=dia+"/"+mes+"/"+any;
                
                
                System.out.println("El meu nom �s "+ nomcomplet );
                System.out.println("Vaig neixer el "+ datacompleta );
                if (traspaso) {
                    System.out.println( si_traspas  );
                }else{
                    System.out.println( no_traspas  );
                
                
                
                
                
                
                
	}

	}
}

   
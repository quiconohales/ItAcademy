import java.util.Arrays;
import java.util.Scanner;
/**
 * @author Francesc Nohales g
 *
 */
public class ciutats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// -----------------------FASE 1 -----------------------------
		System.out.println("" );
		System.out.println("FASE 1 -------------------------------------- " );
		System.out.println("" );	
		// Es crean variables i scanner
		String ciutat1 = null,ciutat2= null,ciutat3= null,ciutat4= null,ciutat5= null,ciutat6= null;
		try (Scanner scan = new Scanner(System.in)) {
			// Es demana els noms de les ciutats
			for (int x=1;x<7;x++) {
				System.out.print("Introdueix la ciutat número " + x + ": ");
				String lectura = scan.nextLine();
				switch (x) {
				case 1:
					ciutat1=lectura;
					break;
				case 2:
					ciutat2=lectura;
					break;
				case 3:
					ciutat3=lectura;
					break;
				case 4:
					ciutat4=lectura;
					break;
				case 5:
					ciutat5=lectura;
					break;
				case 6:
					ciutat6=lectura;
					break;
				}
			}
		}
		
		// Es mostran per pantalla els noms de les ciutats
		for (int z=1;z<7;z++) {
			switch (z) {
			case 1:
				System.out.println("La ciutat " + z + " és : "+ciutat1);
				break;
			case 2:
				System.out.println("La ciutat " + z + " és : "+ciutat2);
				break;
			case 3:
				System.out.println("La ciutat " + z + " és : "+ciutat3);
				break;
			case 4:
				System.out.println("La ciutat " + z + " és : "+ciutat4);
				break;
			case 5:
				System.out.println("La ciutat " + z + " és : "+ciutat5);
				break;
			case 6:
				System.out.println("La ciutat " + z + " és : "+ciutat6);
				break;
			}
		}
		// -----------------------FASE 2 -----------------------------
		System.out.println("" );
		System.out.println("FASE 2 -------------------------------------- " );
		System.out.println("" );	
				
		// Inicialitzem array amb les ciutats introduiedes
		String[] arrayCiutats = {ciutat1,ciutat2,ciutat3,ciutat4,ciutat5,ciutat6};  
				
		// Ordenem l'array
		Arrays.parallelSort(arrayCiutats);
		
		//Imprimim els valors de l'array
		System.out.println("Llistem les ciutats ordenades");
		for (int y=0; y<arrayCiutats.length  ;y++) {
			System.out.println("ciutat : "+arrayCiutats[y]);
		}
		
		// -----------------------FASE 3 -----------------------------
		System.out.println("" );
		System.out.println("FASE 3 -------------------------------------- " );
		System.out.println("" );	
		
		// Inicialitzem array de les ciutats modificades
		String[] ArrayCiutatsModificades=arrayCiutats;
		// recorrem el array de ciutats
		for (int y=0; y < arrayCiutats.length  ;y++) {
			
			// asignem a una variable de tipus stringbuffer el valor de cada posicio
			StringBuffer intercanvi=new StringBuffer (arrayCiutats[y]);
			
			// comprobem si alguna de les lletras es 'a' o 'A' i es substitueix per un 4 
			for (int z=0;z<arrayCiutats[y].length();z++) {
				if (intercanvi.charAt(z)=='a' || intercanvi.charAt(z)=='A'  ) {
					intercanvi.setCharAt(z,'4');
				}
			}
			//asignem al nou string les ciutats ya modificades
			ArrayCiutatsModificades[y]=intercanvi.toString();
		}
		// Ordenem l'array e imprimim el seu contingut
		Arrays.parallelSort(ArrayCiutatsModificades);
		System.out.println("Llistem les ciutats ordenades");
		
		for (int y=0; y<ArrayCiutatsModificades.length  ;y++) {
			System.out.println("ciutat : "+ArrayCiutatsModificades[y]);
		}
		
		
		// -----------------------FASE 4 -----------------------------
		System.out.println("" );
		System.out.println("FASE 4 -------------------------------------- " );
		System.out.println("" );	
		
		//
		// Creem una variable amb el valor de cada ciutat
		// Pasem a un array de char el valor de la variable
		// Recorrem el array de manera inversa per mostrar-ho tal com es demana
		// Es repeteix 6 vegades
		//
		
		String cadena0 = arrayCiutats[0];
		char Ciutats0[] = cadena0.toCharArray();
		for (int zz = Ciutats0.length; zz > 0; zz--) {
			System.out.print(Ciutats0[zz - 1] + " ");
		}
		System.out.println(" ");

		String cadena1 = arrayCiutats[1];
		char Ciutats1[] = cadena1.toCharArray();
		for (int zz = Ciutats1.length; zz > 0; zz--) {
			System.out.print(Ciutats1[zz - 1] + " ");
		}
		System.out.println(" ");

		String cadena2 = arrayCiutats[2];
		char Ciutats2[] = cadena2.toCharArray();
		for (int zz = Ciutats2.length; zz > 0; zz--) {
			System.out.print(Ciutats2[zz - 1] + " ");
		}
		System.out.println(" ");

		String cadena3 = arrayCiutats[3];
		char Ciutats3[] = cadena3.toCharArray();
		for (int zz = Ciutats3.length; zz > 0; zz--) {
			System.out.print(Ciutats3[zz - 1] + " ");
		}
		System.out.println(" ");

		String cadena4 = arrayCiutats[4];
		char Ciutats4[] = cadena4.toCharArray();
		for (int zz = Ciutats4.length; zz > 0; zz--) {
			System.out.print(Ciutats4[zz - 1] + " ");
		}
		System.out.println(" ");

		String cadena5 = arrayCiutats[5];
		char Ciutats5[] = cadena5.toCharArray();
		for (int zz = Ciutats5.length; zz > 0; zz--) {
			System.out.print(Ciutats5[zz - 1] + " ");
		}
		System.out.println(" ");

	}
	
	}



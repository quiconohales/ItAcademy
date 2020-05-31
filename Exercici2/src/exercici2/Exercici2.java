package exercici2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Francesc Nohales 
 *
 */
public class Exercici2 {
	public static void main(String[] args) {
		// FASE 1-------------------------------------------------
		System.out.println(" **************** INICI FASE 1 ***********************************");
		// init the array and assign values
		char[] nom = {'F', 'r', 'a', 'n', 'c', 'e', 's', 'c'};

		// print the values of the array
		for (int x=0; x<nom.length;x++){
			System.out.print(nom [x]+" ");
		}
		
		System.out.println(" ");
		System.out.println(" ");
		//FASE 2 ---------------------------------------------------
		System.out.println(" ****************** INICI FASE 2 **************************");
			// init the List and assign values, with the name			
		List <Character> Name;
		Name = new ArrayList<>();
		Name.add('F');
		Name.add('r');
		Name.add('1');
		Name.add('n');
		Name.add('c');
		Name.add('e');
		Name.add('s');
		Name.add('c');
		// Es recorren tota la llista i evaluem primer vocals, desprès nùmeros i sino és compleix cap dels dos s'interpreta que és una consonant.
		// d'aquesta manera s'optimitza el número d'iteracions 
		for (int z=0; z < Name.size();z++){
		
			if (Name.get(z)==('a') || Name.get(z)==('e')|| Name.get(z)==('i')|| Name.get(z)==('o')|| Name.get(z)==('u')  )  {
				System.out.println(Name.get(z) +" VOCAL ");
				} else if (Name.get(z)==('0') || Name.get(z)==('1')|| Name.get(z)==('2')|| Name.get(z)==('3')|| Name.get(z)==('4') || Name.get(z)==('5')|| Name.get(z)==('6')|| Name.get(z)==('7')|| Name.get(z)==('8')|| Name.get(z)==('9')    ) {
					System.out.println(Name.get(z) +" Els noms de persones no poden contenir números ! ");
				} else {
					  System.out.println(Name.get(z) +" CONSONANT ");
				}
			}
		
		// FASE 3-------------------------------------------------
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("INICI FASE 3 ");
		// init the Map and assign values
		Map<String, Integer > nomMap = new HashMap<String,Integer>();
		nomMap.put("F",1);
		nomMap.put("r",1);
		nomMap.put("a",1);
		nomMap.put("n",1);
		nomMap.put("c",2);
		nomMap.put("e",1);
		nomMap.put("s",1);
		
		
		// FASE 4-------------------------------------------------
		
		System.out.println("****************    INICI FASE 4 ******************************** ");
		// init the List and assign values
		List <Character> SurName;
		SurName = new ArrayList<>();
		SurName.add('N');
		SurName.add('o');
		SurName.add('h');
		SurName.add('a');
		SurName.add('l');
		SurName.add('e');
		SurName.add('s');
		// init the List and assign values in a FullName List with the values of Name List, one blanck space, and the values of SurName List  
		List <Character> FullName;
		FullName = new ArrayList<>();
		for (int y = 0; y < Name.size(); y++) {
			FullName.add(Name.get(y));
			}
		FullName.add(' ');
		
		for (int z = 0; z < SurName.size(); z++) {
			FullName.add(SurName.get(z));
			}
			
		// Print the values of the Fullname List	
		for (int w = 0; w < FullName.size(); w++) {
			System.out.print(FullName.get(w));
			}
	}
}

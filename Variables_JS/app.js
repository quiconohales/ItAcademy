document.write("<h1 >Exercici Variables en JavaScript </h1>");
// FASE 1 
//Asignem valors a les variables segon l'enunciat.
nom ="Francesc";
cognom1="Nohales";
cognom2="Garcia";

dia=20;
mes=09;
any=1970;

// Es mostra per pantalla els valors concatenats
document.writeln("  F A S E     1 "+"<br>");
document.writeln(" "+cognom1+" "+cognom2+" "+nom+"<br>");
document.writeln(dia+"/"+mes+"/"+any+"<br>"+"<br>"+"<br>");


// FASE 2
// Es declara una variable constant, es calcula i mostra per pantalla 
// la diferencia d'anys
document.writeln("  F A S E     2 "+"<br>");
const any_traspas=1948;
frequencia=5;
diferencia=(any-any_traspas)/frequencia|0;
document.writeln("El numero d'anys de traspàs entre l'any de naixement: "+ any + " i el any de traspàs "+any_traspas+ " és de "+ diferencia + "<br>"+ "<br>");



// FASE 3
// Es mostran el anys que son de traspas entre el any de neixement i el de traspàs
// Es mostra per pantalla quan l'any es de traspàs o  no
document.writeln("  F A S E     3 "+"<br>");
si_traspas="L'any de naixement és de traspàs";
no_traspas="L'any de naixement no és de traspàs"; 
traspaso=false;

for ( x = any_traspas; x <= any ;x=x+frequencia) {
    document.writeln("El any "+ x + " és de traspàs"+"<br>");
    if (x == any )traspaso=true; 
}
        
if (traspaso) {
    document.writeln( si_traspas+"<br>"+"<br>"  );
}else{
    document.writeln( no_traspas+"<br>"+"<br>"  );
    }

// FASE 4
document.writeln("  F A S E     4 "+"<br>");
nomcomplet="";
datacompleta="";
nomcomplet=nom+" "+cognom1+" "+cognom2;
datacompleta=dia+"/"+mes+"/"+any;
            
document.writeln("El meu nom és "+ nomcomplet +"<br>" );
document.writeln("Vaig neixer el "+ datacompleta+"<br>" );
if (traspaso) {
            document.writeln( si_traspas  );
}else{
    document.writeln( no_traspas  );
 }



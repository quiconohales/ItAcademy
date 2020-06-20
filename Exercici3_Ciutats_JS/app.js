document.write("<h1 >Exercici 3 Noms ciutats JavaScript </h1>");


//Author Francesc Nohales
// FASE 1 ______________________________________________________
//Assign the values to the variables how the question.
document.writeln("  F A S E     1 "+"<br>");
var city1,city2,city3,city4,city5,city6;

city1 =prompt("Insert the city number 1: ");
city2 =prompt("Insert the city number 2: ");
city3 =prompt("Insert the city number 3: ");
city4 =prompt("Insert the city number 4: ");
city5 =prompt("Insert the city number 5: ");
city6 =prompt("Insert the city number 6: ");

document.writeln(" The city number 1 is "+city1+"<br>");
document.writeln(" The city number 2 is "+city2+"<br>");
document.writeln(" The city number 3 is "+city3+"<br>");
document.writeln(" The city number 4 is "+city4+"<br>");
document.writeln(" The city number 5 is "+city5+"<br>");
document.writeln(" The city number 6 is "+city6+"<br>");
	
// FASE 2 ______________________________________________________
document.writeln(" "+"<br>");
document.writeln("  F A S E     2 "+"<br>"+"<br>");

const cities=[city1,city2,city3,city4,city5,city6];
cities.sort();
for (let index = 0; index < cities.length; index++) {
	document.writeln(cities[index]+"<br>");
	
}
// FASE 3 ______________________________________________________
document.writeln("  F A S E     3 "+"<br>"+"<br>");
modified_cities=[];

for (let index1 = 0; index1 < cities.length; index1++) {
	ciutat=cities[index1];
	document.writeln(ciutat+"<br>");
	remplazat=ciutat.replace(/a/gi,"4");
	modified_cities[index1]=remplazat;
}
modified_cities.sort();
for (let index = 0; index < modified_cities.length; index++) {
	document.writeln( modified_cities[index]+"<br>");
	
}



// init the array and assign values
var name_1 = ["F","r","a","n","c","e","s","c"];

// print the values of the array
for (x=0; x < name_1.length;x++){
    document.writeln(name_1 [x]+" "+"<br>");
}

// FASE 2________________________________________________________
// init the List and assign values, with the name			
// assign a number for evaluate the function 'Fr1ncesc"
document.writeln(" "+"<br>");
document.writeln("  F A S E     2 "+"<br>"+"<br>");

var firstName=[];
firstName[0]="F";
firstName[1]="r";
firstName[2]="1"; // expressly carried out to check operation (a value for 1)
firstName[3]="n";
firstName[4]="c";
firstName[5]="e";
firstName[6]="s";
firstName[7]="c";


// We go through the whole list and evaluate first vowels, then numbers and otherwise it 
//is fulfilled neither is interpreted as a consonant.
//in this way the number of iterations is optimized (traduit per google traslate ;))

for (z=0; z < firstName.length;z++){
    if (firstName[z]=="a" || firstName[z]=="e" || firstName[z]=="i" || firstName[z]=="o" || firstName[z]=="u" )     {
        document.writeln(firstName[z] +"\u00a0"+"\u00a0"+"\u00a0"+" VOCAL "+"<br>"); 
    }else if (firstName[z]=="0" || firstName[z]=="1" || firstName[z]=="2"|| firstName[z]=="3"|| firstName[z]=="4" || firstName[z]=="5"|| firstName[z]=="6" || firstName[z]=="7"|| firstName[z]=="8"|| firstName[z]=="9"  ) {
       			document.writeln(firstName[z] +"\u00a0"+"\u00a0"+"\u00a0"+ "Els noms de persones no poden contenir números ! "+"<br>");
       			} else {
       	            document.writeln(firstName[z] +"\u00a0"+"\u00a0"+"CONSONANT "+"<br>");
       			}
       	}

// FASE 3_____________________________________________
// init and assign values
document.writeln(" "+"<br>");
document.writeln("  F A S E     3 "+"<br>"+"<br>");

// empty object literal with properties added afterward
var dict = new Map();
dict.set("F",1);
dict.set("r",1);
dict.set("a",1);
dict.set("n",1);
dict.set("c",2);
dict.set("e",1);
dict.set("s",1);
for (var [clave, valor] of dict) {
	document.writeln(clave + " = " + valor+"<br>");
  }
document.writeln(" "+"<br>");
//FASE 4_____________________________________________________
document.writeln("  F A S E     4 "+"<br>");

var surName=[];
var fullName=[];
surName[0]="N";
surName[1]="o";
surName[2]="h";
surName[3]="a";
surName[4]="l";
surName[5]="e";
surName[6]="s";
// Insert in fullName array the value of firstname array
for (z=0; z < firstName.length;z++){
	fullName.push(firstName[z]);
}
// Insert the value of space in unicode 
fullName.push("\u00a0");

// Insert in fullName array the value of surname array
for (w=0; w < surName.length;w++){
	fullName.push(surName[w]);
}
// List all the values of fullname array
document.writeln("El nom complet es: "+"<br>"+"<br>");
for (y=0; y < fullName.length;y++){
	document.writeln(fullName[y]);
}




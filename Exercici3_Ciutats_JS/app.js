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
// A question is asked about the names of the cities, and assign the array with the values
const cities=[city1,city2,city3,city4,city5,city6];
cities.sort();
for (let index = 0; index < cities.length; index++) {
	document.writeln(cities[index]+"<br>");
	
}
// FASE 3 ______________________________________________________
document.writeln("  F A S E     3 "+"<br>"+"<br>");
modified_cities=[];
// The values 'a' are replaced by a '1', the option 'gi' The values a are replaced by a 1
//allows to replace more than one re
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

// FASE 4 ______________________________________________________
document.writeln("  F A S E     4 "+"<br>"+"<br>");
// An array is created for each value, from the previous array.
// Each letter is placed in a position of the array
aCity0=[];
for (let index = 0; index < modified_cities[0].length; index++) {
	aCity0[index]=modified_cities[0].charAt(index);
	document.writeln(aCity0[index]);
}
document.writeln("<br>");
aCity1=[];
for (let index1 = 0; index1 < modified_cities[1].length; index1++) {
	aCity1[index1]=modified_cities[1].charAt(index1);
	document.writeln(aCity1[index1]);
}
document.writeln("<br>");
for (let index = 0; index < aCity0.length; index++) {
	document.writeln(aCity0[index]);
}
document.writeln("<br>");
for (let index = 0; index < aCity1.length; index++) {
	document.writeln(aCity1[index]);
}
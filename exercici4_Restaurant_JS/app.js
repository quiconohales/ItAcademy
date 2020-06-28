document.write("<h1 >Exercici 4 Restaurant JavaScript </h1>");

//Author Francesc Nohales
// FASE 1 ______________________________________________________
// This aplication replica the operation of a resturant menu
// The names and prices of the dishes are requested
// Finaly the total ticket is shown

document.writeln("  F A S E     1 "+"<br>");
//Assign the values to the variables as the statement say
var five,ten,wenty,fifty,oHundred,twoHundred,fiveHundred;
var menu=[,,,,,],prices=[,,,,,];
var dishPrice=0;

// The names and prices of the dishes are requested
for (let index = 0; index < menu.length; index++) {
	dishName=prompt("Insert the name of dish nº : "+(index+1)  );
	menu[index]=dishName;
	dishPrice=parseInt(prompt("Insert the price of dish nº  : " ),10);
	prices[index]=dishPrice;
}
	
// FASE 2 ______________________________________________________
document.writeln(" "+"<br>");
document.writeln("  F A S E     2 "+"<br>"+"<br>");
// The names and prices of the menu  are printed on the screen
for (let index = 0; index < menu.length; index++) {
	document.writeln(" The Dish of the menu number "+ (index+1) +" is " +menu[index]);
	document.writeln(" this prices is : "+ prices[index]+ "€" + "<br>" );
}
// FASE 3 ______________________________________________________
document.writeln(" "+"<br>");document.writeln("  F A S E     3 "+"<br>"+"<br>");
var pausa=prompt("This is the menu press a key to continue " );
var order=[];
totalOrder=0;
x=0;
/// we ask about the dishes they want
while (dishName!=0){
	dishName=prompt("Insert the number of dish (Press 0 to Exit:) " );
	if (dishName!=0) {order[x]=(dishName)};
	x++;
} 

// Although the exercise does not ask for it, we show the dishes ordered
document.writeln(" "+"<br>");
for (let index = 0; index < order.length; index++) {
	document.writeln(order[index]+"<br>");
}
// The arry of the order is traversed and it is checked that it exists,
// in the correct case it is added to the total of the order
for (let index = 0; index < order.length; index++) {
	if (order[index] > menu.length) {
		document.writeln("Error this product don't exist "+order[index]+"<br>"+"<br>");
	}else{
		totalOrder+=prices[order[index]-1];
	}
}
document.writeln("The total amount is: " +totalOrder)
// Final	

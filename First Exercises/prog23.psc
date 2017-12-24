Algoritmo prog23
	
	definir day1 como entero;
	definir month1 como entero;
	definir year1 como entero;
	
	definir day2 como entero;
	definir month2 como entero;
	definir year2 como entero;
	
	definir dayresult como entero;
	
	
	
	definir result como entero;
	
	
	escribir "introducir dia de la primera fecha:";
	leer day1;
	
	escribir "introducir mes de la primera fecha:";
	leer month1;
	
	escribir "introducir año de la primera fecha:";
	leer year1;
	escribir n;
	
	escribir "introducir dia de la segunda fecha:";
	leer day2;
	
	escribir "introducir mes de la segunda fecha:";
	leer month2;
	
	escribir "introducir año de la segunda fecha:";
	leer year2;
	
	
	Mientras year1 > 0  Hacer
		
		year1 = year1 - 1;
		month1 = month1 + 12;
		
	Fin Mientras
	
	Mientras month1 > 0  Hacer
		
		month1 = month1 - 12;
		day1 = day1 + 365;
		
	Fin Mientras
	
	
	Mientras year2 > 0  Hacer
		
		year2 = year2 - 1;
		month2 = month2 + 12;
		
	Fin Mientras
	
	Mientras month2 > 0  Hacer
		
		month2 = month2 - 12;
		day2 = day2 + 365;
		
	Fin Mientras
	
	si day1 > day2
		
		dayresult = day1 - day2;
		
		
	SiNo
		
		dayresult = day2 - day1;
		
	FinSi
	
	si dayresult = 1
		
		escribir "hay " dayresult " dia de diferencia";
		
	SiNo
		
		escribir "hay " dayresult " dias de diferencia";
		
		
	FinSi
	
	
		
FinAlgoritmo

Algoritmo prog15
	
	Definir billet500 como Real;
	Definir billet50 como Real;
	Definir billet10 como Real;
	Definir billet5 como Real;
	Definir euro como Real;

	
	
	
	
	Definir cambio como Real;
	
	
	
	Mientras cambio <= 0  Hacer
		
		
		Escribir "introduzca una cantidad de 1 a 500 €";
		leer cambio;
		
	Fin Mientras
	
	
	
	Mientras cambio != 0 Hacer
		
		
		mientras cambio >= 500 Hacer
			
			cambio = cambio - 500;
			
			billet500 = billet500 + 1;
			
		FinMientras
		
		mientras cambio >= 50 Hacer
			
			cambio = cambio - 50;
			
			billet50 = billet50 + 1;
			
		FinMientras
		
		Mientras cambio >= 10 Hacer
			
			billet10 = billet10 + 1;
			cambio = cambio - 10;
			
			
			
		Fin Mientras
		
		Mientras cambio >= 5 Hacer
			
			cambio = cambio - 5;
			
			billet5 = billet5 + 1;
			
		Fin Mientras
		
		Mientras cambio >= 1 Hacer
			
			cambio = cambio - 1;
			
			euro = euro + 1;
			
		Fin Mientras
		
		
 		
	Fin Mientras
	
	
	
	Escribir "billetes 500: " billet500; 
	Escribir "billetes de 50: " billet50;
	Escribir " billetes de 10: " billet10;
	Escribir "billletes de 5:  " billet5;
	Escribir "euros: " euro; 
	
	
	
	
FinAlgoritmo








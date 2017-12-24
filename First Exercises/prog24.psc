Algoritmo prog24
	
	definir num1 como entero;
	definir count como entero;
	definir comprobar como real;
	
	Mientras num1 <= 1000 Hacer
		
		
		Para i<-1 Hasta num1 Con Paso 1 Hacer
			
		  
			si num1 % i  == 0
				count = count + 1;
				
				comprobar = num1 % i; 
				
			FinSi
			
			
		Fin Para
		
		si count <= 2
			
			count = 0;
			i = 1
			Escribir num1;
		FinSi
		count = 0;
		num1 = num1 + 1;
	Fin Mientras
	
FinAlgoritmo

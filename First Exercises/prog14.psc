Algoritmo prog14
	
	Definir num como Real;
	Definir numNegative como Real;
	Definir compare como Real;
	
		Repetir
			
			Escribir "Introduzca un numero:";
			leer num;
			
			si num > compare Entonces
				
				compare = num;
				
			FinSi
			
			si num < 0 Entonces
				
				numNegative = num; 
				
			FinSi
			
		Hasta Que num =0
		
		
		Escribir "Este es el numero mayor: " compare;
		Escribir "este es el numero negativo: " numNegative;
		
	
FinAlgoritmo

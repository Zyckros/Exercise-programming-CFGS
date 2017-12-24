Algoritmo prog6
	
	Definir num1 como entero;
	Definir num2 como entero;
	Definir num3 como entero;
	
		Escribir "introduzca el primer numero: " num1;
		leer num1;
		Escribir "introduzca el primer numero: " num2;
		leer num2;
		Escribir "introduzca el primer numero: " num3;
		leer num3;
		
		
		Si num1 < num2 && num1 < num3 && num2 < num3 Entonces
			
			escribir "orden ascendente "  num1 " " num2 " " num3;
			
		FinSi
		
				
			si num1 < num2 && num1 < num3 && num2 > num3 Entonces
				
				escribir "orden ascendente " num1 " " num3 " " num2;
			
			FinSi
			
				
				si num1 > num2 && num1 < num3 && num2 < num3 Entonces
					
					escribir "orden ascendente " num2 " " num1 " " num3;
					
				FinSi
				
					si num1 > num2 && num1 > num3 && num2 < num3 Entonces
					
						escribir "orden ascendente " num2 " " num3 " " num1;	
						
					FinSi
					
						
						si num1 > num2 && num1 > num3 && num2 > num3 Entonces
							
							escribir "orden ascendente " num3 " " num2 " " num1;	
							
						FinSi
						
							
							si num1 < num2 && num1 > num3 && num2 > num3 Entonces
								
								escribir "orden ascendente " num3 " " num1 " " num2;
							FinSi
							
			
		
	
FinAlgoritmo

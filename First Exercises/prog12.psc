Algoritmo prog12
	
	Definir num como Real;
	 num = -1;
		
	Mientras num < 0 || num > 10 Hacer
		
		Escribir "Introducir la nota del alumno: "; 
		leer num;	
		
		si (num < 0  || num > 10) entonces
			
			Escribir "Nota incorrecta, vuelva a intentarlo.";
			
		FinSi
		
	Fin Mientras
	
	
	
	si num >=0 && num <= 4.99 Entonces
		
		Escribir "Suspenso.";
		
	SiNo
		
		si num >=5 && num <= 6.99  Entonces
			
			Escribir "Aprobado.";
			
		SiNo
			
			si num >=7 && num <= 8.99  Entonces
				
				Escribir "Notable.";
				
				
			sino 
				
				si num >=7 && num <= 8.99  Entonces
					
					Escribir "Notable.";
					
				SiNo
					
					si num >= 9 && num <= 10  Entonces
					
					Escribir "Sobresaliente.";
					
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
	
	
	
FinAlgoritmo

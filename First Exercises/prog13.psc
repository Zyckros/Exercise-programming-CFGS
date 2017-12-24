Algoritmo prog9
	
	Definir numimpar como Real;
	Definir numpar como Real;
	
	Para i<-1 Hasta 100 Con Paso 1 Hacer
		
		Si (i % 2) = 1 Entonces
			
			
			numimpar = numimpar + i;
			
		SiNo
			
			numpar = numpar + i;
			
		FinSi
		
		
	Fin Para
	
	Escribir "Este es el resultado de los impares: " numimpar;
	Escribir "Este es el resultado de los pares: " numpar;
	
	
FinAlgoritmo

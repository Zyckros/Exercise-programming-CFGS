Algoritmo prog4
	
	Definir num como entero;
	Dimension num[5];
	
	Definir count como entero;
	count = 1;
	Definir positivos como entero;
	Definir negativos como entero;
	Definir nulos como entero;
	
	
	
	para i<-1 Hasta 5 con paso 1 Hacer
		
		Escribir "introduzca el numero: " i;
		leer num[count];
		
		
		si num[count] < 0 Entonces
			
			negativos = negativos + 1;
			
		SiNo
			
			si num[count] > 0 Entonces
				
				positivos = positivos + 1;
				
			SiNo
				
				nulos = nulos + 1;
				
			FinSi
			
		FinSi
		
		count = count + 1;
		 
	FinPara
	
	
	Escribir "Los numeros positivos son: " positivos;
	Escribir "Los numeros negativos son: " negativos;
	Escribir "Los numeros nulos son: " nulos;
	
FinAlgoritmo

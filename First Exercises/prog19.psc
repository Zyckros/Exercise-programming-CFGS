Algoritmo prog19
	
	
	Definir horaS como entero;
	Definir hora como entero;
	Definir min como entero;
	Definir minS como entero;
	Definir sec como entero;
	Definir secS como entero;
	
		Para r<-1 Hasta 59 Con Paso 1 Hacer
			
			Para j<-1 Hasta 59 Con Paso 1 Hacer
				
				Para i<-1 Hasta 59 Con Paso 1 Hacer
					
					borrar pantalla;
					
					
					si secS = 10 entonces
						
						secS = 0;
						sec = sec + 1;
						
					FinSi
					
					si minS = 10 entonces
						
						minS = 0;
						min = min + 1;
						
					FinSi
					
					si horaS = 10 entonces
						
						horaS = 0;
						hora = hora + 1;
						
					FinSi
					
					Escribir hora, horaS," : " min, minS, " : ", sec, secS; 
					
					esperar 1 segundos;
					
					secS = secS + 1;
					
				Fin Para
				i = 1;
				sec = 0;
				secS = 0;
				minS = minS + 1;
			Fin Para
			j = 1;
			min = 0;
			minS = 0;
			horaS = horaS + 1;
		Fin Para
		
	
	
	

FinAlgoritmo

Algoritmo prog7
	
	Definir A como entero;
	Definir B como entero;
	Definir C como entero;
	Definir inter como entero;
	
		Escribir "introduzca el primer numero:";
		leer A;
		Escribir "introduzca el primer numero:";
		leer B;
		Escribir "introduzca el primer numero:";
		leer C;
		
		
			si A<B && B<C Entonces //A B C
				
					
				escribir " A:" A " B:" B " C:" C;
 			
			FinSi
			
			si A<C && C<B Entonces //A C B
				
				
				inter = B;
				B = C;
				C = inter;
	
			FinSi
			
			si A > B && B > C Entonces //C B A
			
				inter = C;
				C = A;
				A = inter;
			
				escribir "A:" A " B:" B " C:" C;
				
			FinSi
			
			
			si A > C && B > A Entonces //C A B
				
				
				inter = B;
				B = A;
				A = C;
				C = inter;
				
				escribir "A:" A " B:" B " C:" C;
				
				
			FinSi
			
			si A > B && A < C Entonces // B A C
				
				inter = A;
				A = B;
				B = inter;
				
				escribir "A:" A " B:" B " C:" C;
					
			FinSi
			
			si C > B && C < A Entonces // B C A
				
				inter = A;
				A = B;
				B = C;
				C = inter;
				
				escribir "A:" A " B:" B " C:" C;
				
			FinSi				
			
		
	
FinAlgoritmo

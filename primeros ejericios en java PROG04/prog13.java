public class prog13{
	
	public static void main (String[]args){
	
	int numimpar =0;
	int numpar = 0;
	int i = 0;
	for (i=0; i <= 100;i++){
		
		if ((i % 2) == 1){
			numimpar = numimpar + i;
			
		}else{
			numpar = numpar + i;
		}
	}
	
	System.out.println("Este es el resultado de los impares: " + numimpar);
	System.out.println("Este es el resultado de los pares: " + numpar);

	}
}

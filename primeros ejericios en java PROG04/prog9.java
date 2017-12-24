public class prog9{

	public static void main (String[]args){
		int num =0;
		int i=0;

		for(i=0 ;i<=100;i++){
			
			if((i % 2) == 1){
				
				num = num + i;
			}
		}

		System.out.println("Este es el resultado: " + num);
	}
}
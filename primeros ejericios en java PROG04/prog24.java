public class prog24{

	public static void main(String[]args){
		
		int num1 = 1;
		int count = 0;
		int comprobar = 0;
		int i = 0;
		while (num1 <= 1000){
			for(i=1;i<num1;i++){
				if(num1%i==0){
					count += 1;
					comprobar = num1 % i; 
				}							
		}	
			if (count<=2){
				count = 0;
				i = 1;
				System.out.println(num1);
			}
			count = 0;
			num1 += 1;
		}
	}
}
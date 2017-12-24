public class prog19{
	
	public static void main(String[]args){
	
	int horaS = 0;
	int hora = 0;
	int min = 0;
	int minS = 0;
	int sec = 0;
	int secS = 0;
	int i = 0;
	int j=0;
	
		for(i=1; i< 59; i++){
			
			for(j=1;i< 59;i++){
				
				for(i=1; i<59; i++){
					
					System.out.print("\033[H\033[2J");
					
					if(secS==10){
						
						secS = 0;
						sec = sec + 1;			
				}
					
					if(minS==10){
						
						minS = 0;
						min = min + 1;				
					}
					
					if(horaS==10){
						
						horaS = 0;
						hora = hora + 1;						
					}
					
				System.out.println(hora + "" + horaS + " : " + min + "" + minS + " : " + sec + "" + secS); 
					
				try 
				{
					Thread.sleep(1000);
				} 
				catch(InterruptedException e){}
					
					secS = secS + 1;					
				}
				i = 1;
				sec = 0;
				secS = 0;
				minS = minS + 1;
			}
			j = 1;
			min = 0;
			minS = 0;
			horaS = horaS + 1;
		}
	}
}

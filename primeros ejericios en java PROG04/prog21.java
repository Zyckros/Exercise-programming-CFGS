import java.util.Scanner;

public class prog21{
	
	public static void main(String []args){

	Scanner scan = new Scanner(System.in);
	int confighora = 0;
	int config = 0;
	int horaS = 0;
	int hora = 0;
	int min = 0;
	int minS = 0;
	int sec = 0;
	int secS = 0;
	int r = 0;
	int j = 0;
	int i = 0;
	
	System.out.println("introducir el primer valor de la hora X0:00:00 ");
	confighora = scan.nextInt();
	hora = confighora;
	System.out.println("introducir el segundo valor de la hora: 0X:00:00 ");
	confighora = scan.nextInt();
	horaS = confighora;
	System.out.println("introducir el primer valor de los minutos: 00:X0:00 ");
	confighora = scan.nextInt();;
	min = confighora;
	System.out.println("introducir el primer valor de los minutos: 00:0X:00 ");
	confighora = scan.nextInt();;
	minS = confighora;
	System.out.println("introducir el primer valor de los minutos: 00:00:X0 ");
	confighora = scan.nextInt();;
	sec = confighora;
	System.out.println("introducir el primer valor de los minutos: 00:00:0X ");
	confighora = scan.nextInt();;
	secS = confighora;
	
		for(r=1; i < 59;i++){
			for(j=1;i<59;i++){
				for(i=1;i<59;i++){
					
					System.out.print("\033[H\033[2J");
					
					if(secS == 10){
						
						secS = 0;
						sec = sec + 1;	
					}
					
					if(minS == 10){
						
						minS = 0;
						min = min + 1;						
					}
					
					if(horaS == 10){
						
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
import java.util.Scanner;

public class prog23{

	public static void main(String[]args){
	
		Scanner scan = new Scanner(System.in);
		int day1 =0;
		int month1 = 0;
		int year1 = 0;
		int day2 = 0;
		int month2 = 0;
		int year2 = 0;
		int dayresult = 0;
		int result = 0;
		
		System.out.println( "introducir dia de la primera fecha:");
		day1 = scan.nextInt();
		System.out.println("introducir mes de la primera fecha:");
		month1 = scan.nextInt();
		System.out.println("introducir anyo de la primera fecha:");
		year1 = scan.nextInt();
		System.out.println("introducir dia de la segunda fecha:");
		day2 = scan.nextInt();
		System.out.println("introducir mes de la segunda fecha:");
		month2 = scan.nextInt();
		System.out.println("introducir anyo de la segunda fecha:");
		year2 = scan.nextInt();
		
		while(year1>0){

			year1 = year1 - 1;
			month1 = month1 + 12;
		}

		while (month1>0){

			month1 = month1 - 12;
			day1 = day1 + 365;
		}

		while (year2>0){

			year2 = year2 - 1;
			month2 = month2 + 12;	
		}

		while( month2 > 0){

			month2 = month2 - 12;
			day2 = day2 + 365;	
		}

		if (day1>day2){

			dayresult = day1 - day2;	

		}else{

			dayresult = day2 - day1;	
		}

		if(dayresult==1){

			System.out.println( "hay " + dayresult + " dia de diferencia");	
		}else{

			System.out.println( "hay " + dayresult + " dias de diferencia");	
		}
	}	
}
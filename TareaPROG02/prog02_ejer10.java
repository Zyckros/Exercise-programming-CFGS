public class prog02_ejer10 {

public static void main (String [] args){


float x = 4.5f;
float y = 3f;
int i = 2;
int j = i * (int) x;
System.out.println("producto de int por float: j=i*x = " + j);

double dx = 2.0;
double dz = dx * y;
System.out.println("producto de float por double: dz = dx * y = " + dz);

byte bx = 5;
byte by = 2;
byte bz = (byte) (bx-by);
System.out.println("byte 5 - 2 = " + bz);

 bx = -128;
 by = 1;
 bz = (byte) (bx-by); // resultado en byte
 System.out.println("byte -128 - 1 =  " + bz);

 //no consigo poner los parentesis en la operacion
 bz =  (byte) (bx -by); //resultado tipo int
 System.out.println("((int)(-128-1) = " + bz);

short sx = 5;
short sy = 2;
short sz = (short)(sx-sy);
System.out.println("short: 10 - 1 = " + sz);

 sx = 32767;
 sy = 1;
 sz =(short) (sx+sy);
 System.out.println("short 32767 + 1 = " + sz);

char cx =  '\u000f';
char cy = '\u0001';
int z = cx-cy;
System.out.println("char: - = " + z);

 z = cx-1;
System.out.println("char(0x000F) - 1 = " + z);

cx = '\uFFFF';
z = cx;
System.out.println("(int)() = " + z);

sx = (short) cx;
System.out.println("(short)() = " + sx);

 sx = -32768;
z = (char)sx;
System.out.println("-1 short-char-int = " + z);

sx = -1;
cx = (char) sx;
 z = (char) cx;

 System.out.println("-1 short-char-int = " + z);

}
}





import java.util.Scanner;
class InputDayNumber2{
public static void displayDay(int n)
{
switch(n){
case 0:System.out.println("VINITHA");break;
case 1:System.out.println("ANUSHA REDDY");break;
case 2:System.out.println("VANAJA");break;
case 3:System.out.println("INDUMATHI");break;
case 4:System.out.println("HARSHITHA");break;
case 5:System.out.println("SRAVANI");break;
case 6:System.out.println("BHANUSREE");break;
case 7:System.out.println("CHANDRA SEKHAR");break;
case 8:System.out.println("MANI CHANDU");break;
default:System.out.println("YASWANTH");
}//switch
}//displayDay()
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int dn;
dn=scob.nextInt();
displayDay(dn);
}//main()
}//InputDayNUmber1
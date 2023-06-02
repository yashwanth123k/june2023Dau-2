import  java.util.Scanner;
class InputSwap2{
public static void main(String args[]){
Scanner scob=new Scanner(System.in);
System.out.println("Enter a number:");
int num1;
int num2;
num1=scob.nextInt();//5
num2=scob.nextInt();//7
num1=num1+num2;//temp=5
num2=num1-num2;//num1=7
num2=num1-num2;//num2=5"\n"+num2);

System.out.println(num1 +"\n"+num2);
}//main()
}//Input
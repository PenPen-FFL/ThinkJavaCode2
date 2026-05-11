import java.util.Scanner;
void main() {
 //   double feet = 22.22;
//System.out.printf("feet %f", feet); //error because two type specifications only 1 value
  //  System.out.printf("feet = %d", feet); error because two type specifications only 1 value
 //write a program that converts Celsius to Fahrenheit:
    //.0 set Variables
    double Fahrenheit;
    double Celsius;
    double i = 9.0/5.0;
    double i_2 = 32;
    Scanner in  = new Scanner(System.in);
 // 1. Prompt the user for input

 System.out.println("Enter Celsius");
 Celsius = in.nextDouble();

 // 2. Convert and return
    Fahrenheit = Celsius * i + i_2;
    System.out.print(Fahrenheit);
}
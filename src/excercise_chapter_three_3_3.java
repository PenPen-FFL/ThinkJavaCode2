import java.util.Scanner;
void main() {
    // 0. Variables
    int Seconds;
    int Minutes;
    int Hours;
    int Seconds_in;
    Scanner in = new Scanner(System.in);

    // 1. prompt for input
    System.out.print("Enter Seconds: ");
    Seconds_in = in.nextInt();

    // 2. calculate and return value
    Hours = Seconds_in / 3600;
    int Hour_remainder = Seconds_in % 3600;
    Minutes = Hour_remainder / 60;
    int Minutes_remainder = Hour_remainder % 60;
    Seconds = Minutes_remainder;
    //System.out.println(Hours);
    //System.out.println(Hour_remainder);
    //System.out.println(Minutes);
    //System.out.println(Minutes_remainder);
    //System.out.println(Seconds);
System.out.println("it´s currently " + Hours + " Hours " + Minutes + " Minutes and "
        + Seconds + " Seconds");


}
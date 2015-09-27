import java.util.Scanner;

class homework1 {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);

double t = in.nextInt(); //time
double g = 9.8; //g
double h; //high

if (t<0){
System.out.println("Time must be >= 0");
}
h = (g * t * t) / 2;
System.out.println("High = "+h);

}
}
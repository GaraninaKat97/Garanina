import java.util.Scanner;
class homework4 {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("Add radius;x,y of centre cyrcle;x,y of dote");
int r = in.nextInt(); //radius
int x = in.nextInt(); //x of centre cyrcle
int y = in.nextInt(); //y of centre cyrcle
int x1 = in.nextInt(); //x of dote
int y1 = in.nextInt(); //y of dote

if ((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y) < r * r) {
System.out.println("INSIDE");
}
else{ 
if ((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y) == r * r)
System.out.println("ON cyrcle");
else
System.out.println("OUTSIDE");
}
}
}
import java.util.Scanner;

class HomeWork2 {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);

int n = in.nextInt(); //size

for (int i = 1;i <= 2 * n + 1;i++){
for (int j = 1;j <= 2 * n + 1;j++){
if (i <= n + 1){
if ((j > n - i + 1) && (j < n + i + 1))
System.out.print("o");
else
System.out.print(" ");
}
else{
if ((j > i - n - 1) && (j < 3 * (n + 1) - i))
System.out.print("o");
else
System.out.print(" ");
}

}
System.out.println();
}

}
}

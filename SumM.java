public class SumM {
	public static void main(String[] args) {
		int m = Integer.valueOf(args[0]);
		int i;
		double y, sum = 0;
	for (i=1;i<=m;i++) {
		y = 1.0/((2*i-1)*(2*i-1));
	if (i%2==0)sum = sum-y;
		else sum = sum+y;
} 
	System.out.print("Sum");
	System.out.print(m);
	System.out.print("=");
	System.out.print(sum);
} 
}
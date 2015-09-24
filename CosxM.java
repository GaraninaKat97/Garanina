public class CosxM{
	public static void main(String[] args) {
		int m=Integer.valueOf(args[0]);
		double cos_x=Double.valueOf(args[1]);
	for(int i=0;i<m;i++){
		cos_x=cos_x+Math.cos(cos_x);
}
	System.out.print(cos_x);
}
}
public class TableM {
	public static void main(String[] args) {
		int i,j,s;
		String st;
	for (i=1; i<10; i++) {
	for (j=1; j<10; j++) {
		s=i*j;
		st=String.valueOf(i)+"x"+String.valueOf(j)+"="+String.valueOf(s)+" ";
	if (s<10) {st=st+" ";}
	System.out.print(st);}
	System.out.println();}
}
}
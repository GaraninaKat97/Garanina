class Equation{
    public static void main (String [] args){
        double a=Double.parseDouble(args[0]);
        double b=Double.parseDouble(args[1]);
        double c=Double.parseDouble(args[2]);
        double d, x1, x2;
        d=b*b-4*a*c;
        if (d<0) System.out.println("Error");
        else {
            double sd = Math.sqrt(d);
            x1=((-b)+sd)/(2*a);
            x2=((-b)-sd)/(2*a);
            System.out.print("x1=");
            System.out.println(x1);
            System.out.print("x2=");
            System.out.print(x2);
        }
    }
}
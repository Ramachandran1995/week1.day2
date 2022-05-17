package Week1Day2;

public class calculator {
	
	        public int add(int a, int b) {
	        	return a+b;
	        }
	        public double sub(double x,double y)
	        {
	        	double subt=x-y;
	        	return subt;
	         }
	        public double mul(double u,double v) {
	        	double multiply=u*v;
	        	return multiply;
	        }
	        public int div(int c,int d)
	        {
	        	int divide=c/d;
	        	return divide;
	        }
	        public static void main (String[] args) {
	        	calculator c=new calculator();
	        	System.out.println(c.add(7,9));
	        	System.out.println(c.sub(13.5,9.4));
	        	System.out.println(c.mul(3,3));
	        	System.out.println(c.div(4,2));
	        }
	}
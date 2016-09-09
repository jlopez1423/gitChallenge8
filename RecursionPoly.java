//cREATED A JAVA PROGRAM TO recursively solve polynomials
public class RecursionPoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(poly(3,2));
		System.out.println(poly(4,2));
		System.out.println(poly(2,8));
		System.out.println(poly(5,5));
		System.out.println(poly(300,2));
	}
	static int poly(int a, int n){
		if( a != (int)a ){
			System.out.println("a must be a real number");
			return -1;
		} if(n != (int)n || n < 0){
			System.out.println("n must be a positive real number");
			return -1;
		} if(n == 1){
			return a;
		} return a*poly(a, n-1);
	}
}

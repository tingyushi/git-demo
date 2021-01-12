/*
 * Description:
 * Compute the GCD of two non-negative integers p and q.
 * If q == 0, then the answer is p.
 * If not, divide p by q and take the remainder r. 
 * The answer is the GCD of q and r.
 * */


public class gcd {
	public static void main(String[] args){
		System.out.println("aa");
	}

	public static int getGCD(int p, int q) {
		if (q == 0) {
			return p;
		}
		return getGCD(q, p % q);
	}
}

/*
Using recursion
*/

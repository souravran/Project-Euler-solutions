/* 
 * Solution to Project Euler problem 69
 * By Nayuki Minase
 * 
 * http://nayuki.eigenstate.org/page/project-euler-solutions
 * https://github.com/nayuki/Project-Euler-solutions
 */


public final class p069 implements EulerSolution {
	
	public static void main(String[] args) {
		System.out.println(new p069().run());
	}
	
	
	public String run() {
		double maxVal = -1;
		int maxNum = -1;
		for (int i = 1; i <= 1000000; i++) {
			double val = (double)i / Library.totient(i);
			if (maxNum == -1 || val > maxVal) {
				maxVal = val;
				maxNum = i;
			}
		}
		return Integer.toString(maxNum);
	}
	
}

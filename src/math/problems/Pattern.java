package math.problems;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 */
		printNumber();
	}

	public static void printNumber(){

		int n = 100;
		int number = 1;
		for (int i = 100; i <= n; i--){
			if( i >= 90){
			System.out.println(i);
			}else if(i>= 70){
				--i;
				System.out.println(i);
			}else if(i>= 40){
				--i;
				--i;
				System.out.println(i);
			}else if(i>= 1){
				--i;
				--i;
				--i;
				System.out.println(i);
			}
		}
	}
}

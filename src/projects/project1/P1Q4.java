package projects.project1;

public class P1Q4 {
	
	public static void main(String args[]) {
		int a = 1, b, c = 2, d = 3;
		a++;//unary
		//a is the only operand of the single ++ operator
		
		b = a + c;//binary
		//a and c are operands of the single + operator
		
		System.out.println((d > a) ? (a + c) : (a--)); //ternary
		// (d > a), (a+c), (a--) are the operands of the 2 operators: ? and :
		
		/* unary uses one operand, binary uses 2 operand, and ternary uses 3 */
		
	
	
	}
}

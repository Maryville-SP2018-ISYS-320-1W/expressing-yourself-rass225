/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

/*
 	Your predicted values for the expressions
	1. 2 + 3 * 4 - 6 = 8
	2. 14 / 7 * 2 + 30 / 5 + 1 = 11
	3. ( 12 + 6 ) / 3 * 2 = 12
	4. (238 % 10 + 3 ) % 7 = 26.8 / 7 = 3.828
	5. 6 * 7 % 4 = 10.5
	6. 2 + 2 + 3 + 4 = 11
	7. "2 + 2" + 3 + 4 = 11
	8. 3 + 4 + " 2 + 2" = 11
 
 	After testing the expressions in the main method, indicate above if your predictions were correct.
*/

public class TestExpressions {

	public static void main(String[] args) {
	
		System.out.println("YOUR_TEST_EXPRESSION");
		System.out.println(2 + 3 * 4 - 6);
		System.out.println( 14 / 7 * 2 + 30 / 5 + 1);
		System.out.println(( 12 + 6 ) / 3 * 2);
		System.out.println((238 % 10 + 3 ) % 7 );
		System.out.println(6 * 7 % 4);
		System.out.println(2 + 2 + 3 + 4);
		System.out.println("2 + 2" + 3 + 4);
		System.out.println(3 + 4 + " 2 + 2");
	}

}

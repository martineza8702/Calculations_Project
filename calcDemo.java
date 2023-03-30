//Alex Martinez
//
public class calcDemo {
	public static void main(String []args)
	{
		int x = 12 , y = 5;//declare and assign  values for x and y
		int sum = x + y;//declare sum and assign it formula to calculate x+y
		int product = x*y;// declare product and assign it x*y
		int quotient = x / y;//  declare quotient and assign it x/y
		int difference = x - y;//declare difference and assign it x-y
		//below uses the System.out.println to print string literal and the
		//correct formula to output the value determined and return the line
		
		
		System.out.println("The sum of x and y is:" + sum);
		System.out.println("The product of x and y is:" + product);
		System.out.println("The quotient of x and y is:" + quotient);
		System.out.println("The difference of x and y is:" + difference);
		//create 2 output statements to display the value of x%y and then y%x and say the remainder is:
		
		System.out.println("The remainder of x%y is "+ (x%y));
		System.out.println("The remainder of y%x is "+ (y%x));
		System.out.println("The division qoutient of y/x is "+(y/x));
		System.out.println("The full divison answer is "+(1.0/2)); 
		//As long as one of your numbers is a decimal value you will get the full answer
		
		//Create output statement to us a type cast to output full division answer
		System.out.println("The full division answer is "+(double)y/x);
		
	}

}

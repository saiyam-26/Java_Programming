public class Basics
{
    // square function
    public static void square(int x){
        System.out.println("square = " + (x * x));
    }
    
    // sum function
    public static void sum(int a, int b){
        System.out.println("sum = " + (a + b));
    }
    
	public static void main(String[] args) {
		
		square(2); // arguments
		sum(5,8);  
	}
}
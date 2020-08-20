public class FizzBuzz{

	public void fizzBuzz(){

		for(int i=1;i<=20;i++){
			if(i%3==0 && i%5 != 0)
				System.out.println("Fizz");
			else
				if(i%3!=0 && i%5 ==0)
					System.out.println("Buzz");
				else
					if(i%3==0 && i%5 ==0)
						System.out.println("FizzBuzz");
					else 
						System.out.println(i);
		}

	}
	public static void main(String[] args){
		FizzBuzz fb = new FizzBuzz();
		fb.fizzBuzz();

	}
}				

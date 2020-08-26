public class FizzBuzz{

	private Integer entero;

	public FizzBuzz(int e){
		this.entero = e;
	}

	public String toString(){

		if(this.entero%3==0 &&  this.entero%5 != 0)
			return "Fizz";

		if(this.entero%3!=0 && this.entero%5 ==0)
			return "Buzz";

		if(this.entero%3==0 && this.entero%5 ==0)
			return "FizzBuzz";

		return entero.toString();
	}

	public static void main(String[] args){
		for (int i=0; i<100 ;i++ ) {
			System.out.println(new FizzBuzz(i));
		}
	}
}

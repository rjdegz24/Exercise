package lambdas;

public class Main {

	public static void main(String[] args) {

		GreetingMesssage gm = new GreetingMesssage() {
			
			@Override
			public void greet(String name) {
				System.out.println("Hello " + name);				
			}
		};
		gm.greet("Robert");
		
		GreetingMesssage gm2 = (name) -> {
			System.out.println("Hello " + name);
		};
		gm2.greet("Robert");
		
	}

}

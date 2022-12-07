package org.emp;

public class GreensBank extends Axisbank{

  @Override
	public void fixed() {
		System.out.println("5%");
	}

	@Override
	public void deposit() {
		System.out.println("6%");
	}




	public static void main(String[] args) {
		
		GreensBank g = new GreensBank();
		
		g.fixed();
		g.deposit();
		g.savings();
	}
}

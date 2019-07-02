public class EncapsulationVsAbstraction_Example{
	class Phone{
		String number;
		void enterNumber(String number){
			this.number=number;
			System.out.println("Number entered..");
			validateNumber();//encapsulation
			call();//encapsulation
		}
		private void validateNumber(){
			System.out.println("number validated..");
		}
		private void call(){
			System.out.println("making call...");
		}
	}
	public static void main(String[] args){
		EncapsulationVsAbstraction_Example.Phone phone=new EncapsulationVsAbstraction_Example().new Phone();
		phone.enterNumber("0123456789");//abstraction
		//phone.validateNumber();//hiding unnacessary
		phone.call();
	}
}
/*You can do encapsulation without using abstraction, but if you wanna use some abstraction, you'll need encapsulation.*/

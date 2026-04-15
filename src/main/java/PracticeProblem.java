public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(hasCapital("Banana"));
		System.out.println(isPrime(7));

	}

	public static Boolean hasCapital(String buh){
		System.out.println(!buh.toLowerCase().equals(buh));

		Boolean diy = false;
		int length = buh.length();
		for (int num = 0; num < length; num++ ){
			String letter;
			letter = buh.substring(num, num+1);
			if (letter.toUpperCase() == letter){
				diy = true;
			}

		}

		return diy;
	}

	public static Boolean isPrime(int buh){
		boolean prime = true;
		if (buh == 1){
			return prime = false;
		}
		for (int num = 0; num < buh; num++){
			if (num == 0 || num == 1){

			}
			else if (buh%(num) == 0){
				System.out.println((num));
				prime = false;
			}
		}
		return prime;
	}

}

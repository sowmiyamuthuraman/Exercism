class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
		int numOfDigits=Integer.toString(numberToCheck).length();
		int initialNumber=numberToCheck;
		int finalNumber=0;
		while(numberToCheck>0){
			finalNumber+=Math.pow(numberToCheck%10,numOfDigits);
			numberToCheck/=10;
		}
		if(initialNumber==finalNumber){
			return true;
		}
		return false;		
	}

}

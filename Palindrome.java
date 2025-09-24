class Palindrome{
	public static void main(String[] args) {
		int num = 121;
		int temp_var = num;
		int lastDig = 0;
		
		while(num != 0){
			lastDig = num%10;
			int dup= temp_var/10;
		} 
		System.out.println(temp_var);
		System.out.println(lastDig);
		if(temp_var==lastDig){
			System.out.println("Palindrome");
		}
		else
			System.out.println("Executing! Your program sucks somewhere!");

		
	}
}
package while_loop_task;

public class primeNumber {

	public class TocheckPalindromeUsingWhileloop {

	}

	int i = 2, count = 0;
	int num = 4;
System.out.println("Enter n value : ");
	while(i<=num/2)
	{
					if(num% i ==0) {
						count++;
						
					}
					i++;
				if(count==0)
	{
		System.out.println("number is prime Number");
	}else
	{
		System.out.println("The number is not prime number");
	}
}

}

package ipaddress;

import java.util.Scanner;

/* Sample IPs for input:
172.31.255.255 
192.168.255.255
192.168.0.0
10.255.255.255
172.16.0.0
10.0.0.0
Hello.ip
*/

public class Solution 
{
	@SuppressWarnings("unused")
	private static void pause(int milliseconds)
	{
		try
		{
			Thread.sleep(milliseconds);
		}
		catch(Exception e)
		{

		}
	}
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
			System.out.println("Enter your IP: ");
		while(in.hasNext())
		{
			String IP = in.next();
			
			//Using pause() to slow down with the results
			pause(1500); 
			System.out.println("\n" + IP.matches(new MyRegex().pattern));
		}	
	}
}

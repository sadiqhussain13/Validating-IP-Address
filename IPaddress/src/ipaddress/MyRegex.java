package ipaddress;

public class MyRegex 
{
	String ip0to255 = "(\\d{1,2}||(0|1)\\s{2}||2[0,4]\\d||25[0,5])";     //No spaces in between
	public String pattern = ip0to255 + "\\." + ip0to255 + "\\." + ip0to255 + "\\." + ip0to255; 
}

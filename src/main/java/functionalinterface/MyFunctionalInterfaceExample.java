package functionalinterface;

import java.util.Arrays;
import java.util.List;

public class MyFunctionalInterfaceExample
{
	public static void main(String[] args)
	{
		List<String> names = Arrays.asList(new String[] { "ram", "shyam", "ghanshyam" });
		MyInterface<String> printName = name -> System.out.println(name);

		names.forEach(name -> printName.consume(name));
	}
}

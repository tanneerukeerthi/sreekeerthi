import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String string = "2";
        boolean numeric = true;

        try {
                Double num = Double.parseDouble(string);
            }    catch (NumberFormatException e)
        {
            numeric = false;
        }

        if(numeric)
            System.out.println(string + " ");
        else
            System.out.println(string + " ");
	}
}

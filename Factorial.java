package com.Exercise2.code;

public class Factorial {
	public static int printIntFactorials(int i, int fn)
	{
	    while (true)
	    {
	        if (Integer.MAX_VALUE / fn < (i+1)) {
	            break;
	        }
	        i++;
	        fn *= i;

	    }
	return fn;
	}

	public static long printLongFactorials(long input,long factorial)
	{

	    while (true)
	    {
	        if (Long.MAX_VALUE / factorial < (input+1)) {
	            break;
	        }
	        input++;
	        factorial *= input;
	    }
	    return factorial;

	}

}

package com.customexception;

@SuppressWarnings("serial")
public class bankingException extends Exception{
	public bankingException(String msg)
	{
		super(msg);
	}

}

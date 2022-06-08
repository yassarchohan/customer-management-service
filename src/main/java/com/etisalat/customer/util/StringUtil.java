package com.etisalat.customer.util;

import com.etisalat.customer.constant.Constants;

public class StringUtil implements Constants
{
	/**
	 * Used to check whether it is null or empty
	 * 
	 * @param text
	 * @return
	 */
	public static boolean isNullOrEmpty(String text)
	{
		boolean isBlank = true;
		if (text != null)
		{
			if (!text.trim().equals(""))
			{
				isBlank = false;
			}
		}
		return isBlank;
	}
	public static boolean isNotNullAndEmpty(String text)
	{
		if(text != null && !text.isEmpty())
			return true;
		
		return false;
	}
	
	
	public static String isNullReturnEmpty(String text)
	{
		
		if (text == null)
		{
			text = "";
		}
		return text;
	}

}

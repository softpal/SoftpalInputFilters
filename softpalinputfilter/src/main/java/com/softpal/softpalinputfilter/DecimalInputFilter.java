package com.softpal.softpalinputfilter;

import android.text.InputFilter;
import android.text.Spanned;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 The type Decimal input filter.
 */
public class DecimalInputFilter implements InputFilter
{
	
	/**
	 The M pattern.
	 */
	Pattern mPattern;
	
	/**
	 Instantiates a new Decimal input filter.
	 
	 @param digitsBeforeZero the digits before zero
	 @param digitsAfterZero  the digits after zero
	 */
	public DecimalInputFilter(int digitsBeforeZero,int digitsAfterZero)
	{
		mPattern = Pattern.compile("[0-9]{0," + (digitsBeforeZero) + "}+((\\.[0-9]{0," + (digitsAfterZero - 1) + "})?)||(\\.)?");
	}
	
	@Override public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend)
	{
		
		Matcher matcher = mPattern.matcher(dest);
		if(! matcher.matches())
		{
			return "";
		}
		for(int i = start;i < end;i++)
		{
			if(! (Character.isDigit(source.charAt(i))||source.charAt(i)=='.'))
			{ // Accept only letter & digits ; otherwise just return
				return "";
			}
		}
		return null;
	}
	
}
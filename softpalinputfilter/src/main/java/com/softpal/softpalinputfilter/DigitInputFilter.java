package com.softpal.softpalinputfilter;

import android.text.InputFilter;
import android.text.Spanned;

/**
 The type Digit input filter.
 */
public class DigitInputFilter implements InputFilter
{
	@Override public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend)
	{
		for(int i = start;i < end;i++)
		{
			if(! Character.isDigit(source.charAt(i)))
			{ // Accept only letter & digits ; otherwise just return
				return "";
			}
		}
		return null;
	}
	
}

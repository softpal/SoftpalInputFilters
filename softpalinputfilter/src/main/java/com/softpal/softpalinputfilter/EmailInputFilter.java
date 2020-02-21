package com.softpal.softpalinputfilter;

import android.text.InputFilter;
import android.text.Spanned;

/**
 The type Email input filter.
 */
public class EmailInputFilter implements InputFilter
{
	@Override public CharSequence filter(CharSequence src, int start, int end, Spanned dst, int dstart, int dend)
	{
		if(src.equals(""))
		{ // for backspace
			return src;
		}
		if(src.toString().matches("[a-zA-Z ]+"))
		{
			return src;
		}
		return "";
	}
	
}

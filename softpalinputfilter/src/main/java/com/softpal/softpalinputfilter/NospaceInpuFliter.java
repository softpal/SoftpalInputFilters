package com.softpal.softpalinputfilter;

import android.content.Context;
import android.text.InputFilter;
import android.text.Spanned;

/**
 The type Nospace inpu fliter.
 */
public class NospaceInpuFliter implements InputFilter
{
	
	private static final String TAG = NospaceInpuFliter.class.getSimpleName();
	private Context context;
	
	@Override
	public CharSequence filter(CharSequence source,int start,int end,Spanned dest,int dstart,int dend)
	{
		for(int i = start;i < end;i++)
		{
			if(Character.isWhitespace(source.charAt(i)))
			{
				return "";
			}
			
		}
		return null;
	}
}

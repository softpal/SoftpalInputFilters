package com.softpal.softpalinputfilter;
import android.text.InputFilter;
import android.text.Spanned;

/**
 The type Alphabet input filter.
 */
public class AlphabetInputFilter implements InputFilter
{
	@Override public CharSequence filter(CharSequence src, int start, int end, Spanned dst, int dstart, int dend)
	{
		StringBuilder builder = new StringBuilder();
		for(int i = start;i < end;i++)
		{
			char c = src.charAt(i);
			if(Character.isLetter(c)||Character.isSpaceChar(c))
			{
				builder.append(c);
			}
		}
		
		// If all characters are valid, return null, otherwise only return the filtered characters
		boolean allCharactersValid = (builder.length() == end - start);
		return allCharactersValid ? null : builder.toString();
	}
	
}

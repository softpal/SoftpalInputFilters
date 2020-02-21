# SoftpalInputFilters

### Developed by
[Softpal](https://www.github.com/softpal)

**Features**

    InputFilters can be attached to Editables to constrain the changes that can be made to them.
    
  ## Installation

Add repository url and dependency in application module gradle file:
  
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

### Gradle
[![](https://jitpack.io/v/softpal/SoftpalInputFilters.svg)](https://jitpack.io/#softpal/SoftpalInputFilters)
```javascript
dependencies {
    implementation 'com.github.softpal:SoftpalInputFilters:1.0'
}
```
## Usage

 ### 1.To Use AlphabetInputFilter
       
 
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
	


 ### 1.To Use AlphabetInputFilter

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
	

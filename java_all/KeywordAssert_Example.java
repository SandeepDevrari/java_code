package javaKeywords;
public class KeywordAssert_Example{
	public KeywordAssert_Example(){
		/* An assert statement is used to declare an expected boolean condition in a program. If the program is running with assertions enabled, then the condition is checked at runtime. If the condition is false, the Java runtime system throws an AssertionError.To enable the assertion, -ea or -enableassertions */
		int i=1;
		assert i==0:"value of 'i' is not zero,try again!!!";
	}
	public static void main(String[] args){
		new KeywordAssert_Example();
	}
}

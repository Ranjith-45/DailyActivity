package com.ExceptionHandling;

//If your class extends Exception, your class is Checked Exception 
//If your class extends RuntimException, your class is UnChecked Exception
public class AkashException extends Exception {

	AkashException(String s) {
		super(s);
	}

}
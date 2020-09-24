//Author : Akanksha Shrivastava
//Purpose : a class extending Exception class to handle the case when requested item is not present.

package com.exam.exception;

public class ItemNotFoundException extends Exception {

	public ItemNotFoundException(String message) {
		super(message);
	}

}

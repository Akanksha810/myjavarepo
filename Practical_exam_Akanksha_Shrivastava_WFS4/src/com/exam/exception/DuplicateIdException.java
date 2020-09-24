//Author : Akanksha Shrivastava
//Purpose : A class extending Exception class to handle the case of duplicate ID entered by user.

package com.exam.exception;

public class DuplicateIdException extends Exception {

	public DuplicateIdException(String message) {
		super(message);
	}
}

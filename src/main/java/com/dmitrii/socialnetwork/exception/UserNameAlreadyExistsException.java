package com.dmitrii.socialnetwork.exception;

public class UserNameAlreadyExistsException extends RuntimeException {

  public UserNameAlreadyExistsException(String message) {
    super(message);
  }
}

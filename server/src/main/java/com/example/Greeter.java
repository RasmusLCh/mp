package com.example;

/**
 * This is a class.
 */
public final class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }
  /** {@inheritDoc} */
  public String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}

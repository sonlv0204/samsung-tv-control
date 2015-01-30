package net.afiake.smarttvapi;

/**
 * Thrown when the television denied access, we are not allowed to control the television. This happens when the television user denies access
 * or on timeout or cancel.
 */
public class AuthenticationException extends Exception {
    public AuthenticationException(String message) {
        super(message);
    }
}
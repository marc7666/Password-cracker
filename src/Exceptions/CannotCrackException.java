package Exceptions;

/**
 * @project: Password cracker.
 * @author: mcr99 on 18/03/2022.
 */
public class CannotCrackException extends Exception {
    public CannotCrackException(String message) {
        super(message);
    }
}

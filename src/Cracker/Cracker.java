package Cracker;

import Exceptions.CannotCrackException;

/**
 * @project: Password cracker.
 * @author: mcr99 on 18/03/2022.
 */
public interface Cracker {
    void crackerB() throws CannotCrackException;

    String cracker() throws CannotCrackException;
}

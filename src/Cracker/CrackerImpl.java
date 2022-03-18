package Cracker;

import Exceptions.CannotCrackException;

/**
 * @project: Password cracker.
 * @author: mcr99 on 18/03/2022.
 */
public class CrackerImpl implements Cracker {
    public String password;
    public String lowerCaseAlphabet;
    public String upperCaseAlphabet;
    public String numbers;

    public CrackerImpl(String password) {
        this.password = password;
        this.lowerCaseAlphabet = "abcdefghijklmnopqrstuvwxyz";
        this.upperCaseAlphabet = "ABCDEFGHIJKLMNOPRSTUVWXYZ";
        this.numbers = "0123456789";
    }


    @Override
    public void crackerB() throws CannotCrackException {
        if (emptyPassword()) {
            throw new CannotCrackException("Uncrackable password! \n");
        }
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isDigit(password.charAt(i)) && !Character.isAlphabetic(password.charAt(i))) {
                throw new CannotCrackException("Uncrackable password! \n");
            }
        }
    }

    private boolean emptyPassword() {
        String emprty = "";
        return this.password.equals(emprty);
    }

    @Override
    public String cracker() throws CannotCrackException {
        char[] pass = password.toCharArray();
        char[] cracked = new char[pass.length];
        crackerB();
        for (int i = 0; i < cracked.length; i++) {
            if (Character.isDigit(pass[i])) { /*Digit case*/
                cracked[i] = searchNumber(pass[i]);
            } else if (Character.isAlphabetic(pass[i]) && Character.isUpperCase(pass[i])) { /*Upper case*/
                cracked[i] = searchUpper(pass[i]);
            } else if (Character.isAlphabetic(pass[i]) && Character.isLowerCase(pass[i])) { /*Lower case*/
                cracked[i] = searchLower(pass[i]);
            } else {
                throw new CannotCrackException("Impossible to crack the password");
            }
        }
        return String.valueOf(cracked);
    }

    public char searchUpper(char letter) {
        for (int i = 0; i < upperCaseAlphabet.length(); i++) {
            if (letter == upperCaseAlphabet.charAt(i)) {
                return upperCaseAlphabet.charAt(i);
            }
        }
        return '1';
    }

    public char searchLower(char letter) {
        for (int i = 0; i < lowerCaseAlphabet.length(); i++) {
            if (letter == lowerCaseAlphabet.charAt(i)) {
                return lowerCaseAlphabet.charAt(i);
            }
        }
        return '1';
    }

    public char searchNumber(char number) {
        for (int i = 0; i < numbers.length(); i++) {
            if (number == numbers.charAt(i)) {
                return numbers.charAt(i);
            }
        }
        return '1';
    }
}

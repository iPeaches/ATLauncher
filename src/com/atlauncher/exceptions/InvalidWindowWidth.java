/**
 * Copyright 2013 by ATLauncher and Contributors
 *
 * ATLauncher is licensed under CC BY-NC-ND 3.0 which allows others you to
 * share this software with others as long as you credit us by linking to our
 * website at http://www.atlauncher.com. You also cannot modify the application
 * in any way or make commercial use of this software.
 *
 * Link to license: http://creativecommons.org/licenses/by-nc-nd/3.0/
 */
package com.atlauncher.exceptions;


/**
 * InvalidWindowWidth is thrown when a given Window Width value exceeds allowed value
 * 
 * @author Ryan
 */
public class InvalidWindowWidth extends Exception {

    public InvalidWindowWidth(String message) {
        super(message);
    }

}

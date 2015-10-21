package com.withwiz.jellyfish.exception;

/**
 * project parent exception class<BR/>
 * Created by uni4love on 2010. 3. 30..
 */
public class JellyfishException extends Exception
{
    /**
     * constructor
     *
     * @param message
     *            exception message
     */
    public JellyfishException(String message)
    {
        super(message);
    }

    /**
     * constructor
     *
     * @param throwable
     *            throwable instance
     */
    public JellyfishException(Throwable throwable)
    {
        super(throwable);
    }
}

package com.withwiz.jellyfish.message;

import com.withwiz.jellyfish.exception.JellyfishException;

/**
 * message exception<BR/>
 * Created by uni4love on 2010. 3. 30..
 */
public class MessageException extends JellyfishException
{
	/**
	 * constructor
	 *
	 * @param message
	 *            exception message
	 */
	public MessageException(String message)
	{
		super(message);
	}

	/**
	 * constructor
	 *
	 * @param throwable
	 *            throwable instance
	 */
	public MessageException(Throwable throwable)
	{
		super(throwable);
	}
}

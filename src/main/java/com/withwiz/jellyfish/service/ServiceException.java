package com.withwiz.jellyfish.service;

import com.withwiz.jellyfish.exception.JellyfishException;

/**
 * service exception class.<BR/>
 * Created by uni4love on 2010. 3. 29..
 */
public class ServiceException extends JellyfishException
{
	/**
	 * constructor
	 * 
	 * @param message
	 *            exception message
	 */
	public ServiceException(String message)
	{
		super(message);
	}

	/**
	 * constructor
	 * 
	 * @param throwable
	 *            throwable instance
	 */
	public ServiceException(Throwable throwable)
	{
		super(throwable);
	}
}

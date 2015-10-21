package com.withwiz.jellyfish.filter;

import com.withwiz.jellyfish.message.IMessage;
import com.withwiz.jellyfish.service.IService;
import com.withwiz.jellyfish.service.ServiceException;

/**
 * message filter class<BR/>
 * Created by uni4love on 2010. 3. 29..
 */
abstract public class AMessageFilter<T extends IMessage> implements IFilter<T>
{
	/**
	 * service filtering<BR/>
	 * 
	 * @param message
	 *            message
	 * @return message message
	 * @throws com.withwiz.jellyfish.service.ServiceException
	 */
	@Override
	public T filtering(T message) throws ServiceException
	{
		return filterMessage(message);
	}

	/**
	 * message filtering interface
	 * 
	 * @param message
	 *            message
	 * @return message message
	 * @throws com.withwiz.jellyfish.service.ServiceException
	 */
	abstract public T filterMessage(T message) throws ServiceException;
}

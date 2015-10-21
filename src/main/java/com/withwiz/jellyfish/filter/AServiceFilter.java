package com.withwiz.jellyfish.filter;

import com.withwiz.jellyfish.service.IService;
import com.withwiz.jellyfish.service.ServiceException;

/**
 * service filter class<BR/>
 * Created by uni4love on 2010. 3. 29..
 */
abstract public class AServiceFilter<T extends IService> implements IFilter<T>
{
	/**
	 * service filtering<BR/>
	 * 
	 * @param service
	 *            service
	 * @return service service
	 * @throws ServiceException
	 */
	@Override
	public T filtering(T service) throws ServiceException
	{
		return filterService(service);
	}

	/**
	 * service filtering interface
	 * 
	 * @param service
	 *            service
	 * @return service service
	 * @throws ServiceException
	 */
	abstract public T filterService(T service) throws ServiceException;
}

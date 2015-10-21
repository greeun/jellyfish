package com.withwiz.jellyfish.registry;

import com.withwiz.jellyfish.service.IService;

/**
 * ServiceRegistry interface<BR/>
 * Created by uni4love on 2010. 1. 15..
 */
public interface IServiceRegistry extends IRegistry
{
	/**
	 * register service<BR/>
	 * 
	 * @param service
	 *            IService interface
	 */
	void registerService(IService service);

	/**
	 * unregister service<BR/>
	 * 
	 * @param serviceName
	 *            service class name(ex: class name with full package name)
	 * @return unregistered service
	 */
	IService unregisterService(String serviceName);

	/**
	 * get service<BR/>
	 * 
	 * @param serviceName
	 *            service name
	 * @return IService
	 */
	IService getService(String serviceName);
}

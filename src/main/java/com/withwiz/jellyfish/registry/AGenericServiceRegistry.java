package com.withwiz.jellyfish.registry;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.withwiz.jellyfish.service.IService;

/**
 * Generic service registry<BR/>
 * Created by uni4love on 2010. 3. 28..
 */
public abstract class AGenericServiceRegistry implements IServiceRegistry
{
	/**
	 * logger
	 */
	private Logger					log		= LoggerFactory
													.getLogger(AGenericServiceRegistry.class);

	/**
	 * services store
	 */
	protected Map<String, IService>	store	= null;

	/**
	 * constructor
	 */
	public AGenericServiceRegistry()
	{
		store = new HashMap<String, IService>();
	}

	/**
	 * register a service<BR/>
	 * 
	 * @param service
	 *            service
	 */
	@Override
	public synchronized void registerService(IService service)
	{
		if (store.containsKey(service.getName()))
		{
			log.warn("The service exists already in service registry: {}, this item is skipped.",
					service.getName());
		}
		else
		{
			store.put(service.getName(), service);
			log.info("The service registered to service registry.");
		}
	}

	/**
	 * unregister a service<BR/>
	 * 
	 * @param serviceName
	 *            service name(ex: class name with full package name)
	 * @return unregistered service
	 */
	@Override
	public synchronized IService unregisterService(String serviceName)
	{
        if (store.containsKey(serviceName))
        {
            log.warn("The service exists already in service registry: {}",
                    serviceName);
        }
		return store.remove(serviceName);
	}

	/**
	 * return service by service name<BR/>
	 * 
	 * @param serviceName
	 *            service name(ex: class name with full package name)
	 * @return service
	 */
	@Override
	public IService getService(String serviceName)
	{
        if (store.containsKey(serviceName))
        {
            log.warn("The service NOT exists: {}", serviceName);
        }
        return store.get(serviceName);
	}
}

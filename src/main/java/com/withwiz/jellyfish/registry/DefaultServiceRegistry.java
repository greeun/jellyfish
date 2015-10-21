package com.withwiz.jellyfish.registry;

/**
 * ServiceRegistry default class.<BR/>
 * Created by uni4love on 2010. 1. 12..
 */
public class DefaultServiceRegistry extends AGenericServiceRegistry
{
	/**
	 * registry name
	 */
	private static String			name		= "DEFAULT SERVICE REGISTRY";

    /**
     * return ServiceRegistry singleton instance<BR/>
     *
     * @return ServiceRegistry singleton instance
     */
    public static final DefaultServiceRegistry getInstance()
    {
        return SingletonHolder.singleton;
    }
    
    /**
     * inner singleton instance class
     */
    private static final class SingletonHolder
    {
        static final DefaultServiceRegistry	singleton	= new DefaultServiceRegistry();
    }

	/**
	 * constructor
	 */
	public DefaultServiceRegistry()
	{
	}

	@Override
	public String getName()
	{
		return name;
	}

}

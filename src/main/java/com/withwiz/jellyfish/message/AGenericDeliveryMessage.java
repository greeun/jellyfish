package com.withwiz.jellyfish.message;

import java.util.Map;

/**
 * service delivery message class<BR/>
 * Created by uni4love on 2010. 4. 1..
 */
abstract public class AGenericDeliveryMessage<K, V> implements
		IDeliveryMessage<K, V>
{
	/**
	 * key-value store
	 */
	protected Map<K, V>	store	= null;

	/**
	 * constructor
	 */
	public AGenericDeliveryMessage()
	{
		store = createStore();
	}

	/**
	 * return key-value store<BR/>
	 * @return Map
     */
	abstract protected Map<K, V> createStore();
}

package com.withwiz.jellyfish.message;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * service delivery message class<BR/>
 * Created by uni4love on 2010. 4. 1..
 */
public class DefaultDeliveryMessage<V>
		extends AGenericDeliveryMessage<String, V>
{
	/**
	 * constructor
	 */
	public DefaultDeliveryMessage()
	{
	}

	@Override
	public Map createStore()
	{
		return new HashMap<String, V>();
	}

	/**
	 * add key-value.
	 *
	 * @param key
	 *            key
	 * @param value
	 *            value
	 * @return added value
	 */
	@Override
	public void addValue(String key, V value)
	{
		store.put(key, value);
	}

	/**
	 * get value by key.
	 *
	 * @param key
	 *            key
	 * @return value
	 */
	@Override
	public V getValue(String key)
	{
		return store.get(key);
	}

	/**
	 * get key list.
	 *
	 * @return key list String[]
	 */
	@Override
	public String[] getKeys()
	{
		return store.keySet().toArray(new String[store.size()]);
	}

	/**
	 * clear key-value store.
	 */
	@Override
	public void clear()
	{
		store.clear();
	}

	/**
	 * return the key contain status
	 *
	 * @param key
	 *            key
	 * @return status
	 */
	@Override
	public boolean containsKey(String key)
	{
		return store.containsKey(key);
	}

	@Override
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		Iterator<Map.Entry<String, V>> iterator = store.entrySet().iterator();
		Map.Entry<String, V> entry = null;
		while (iterator.hasNext())
		{
			entry = iterator.next();
			sb.append("key:value=").append(entry.getKey()).append(":")
					.append(entry.getValue()).append("\n");
		}
		return sb.toString();
	}
}

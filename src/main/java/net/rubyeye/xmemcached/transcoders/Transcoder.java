// Copyright (c) 2006  Dustin Sallings <dustin@spy.net>

package net.rubyeye.xmemcached.transcoders;

/**
 * Transcoder is an interface for classes that convert between byte arrays and
 * objects for storage in the cache.
 */
public interface Transcoder<T> {

	/**
	 * Encode the given object for storage.
	 * 
	 * @param o
	 *            the object
	 * @return the CachedData representing what should be sent
	 */
	CachedData encode(T o);

	/**
	 * Decode the cached object into the object it represents.
	 * 
	 * @param d
	 *            the data
	 * @return the return value
	 */
	T decode(CachedData d);

	/**
	 * Set whether store primitive type as string.
	 * 
	 * @param primitiveAsString
	 */
	public void setPrimitiveAsString(boolean primitiveAsString);

	/**
	 * Set whether pack zeros
	 * 
	 * @param primitiveAsString
	 */
	public void setPackZeros(boolean packZeros);

	public boolean isPrimitiveAsString();

	public boolean isPackZeros();
}

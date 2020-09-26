package com.builder.algo.random;

import java.util.LinkedHashSet;
import java.util.Set;

public class LRUCacheWithoutDeque {

	private final int cacheCapacity;

	private final Set<String> cache;

	LRUCacheWithoutDeque(int cacheCapacity) {
		this.cacheCapacity = cacheCapacity;
		cache = new LinkedHashSet<String>(cacheCapacity);
	}

	public void getCache(String key) {

		if (cache.contains(key)) {
			cache.remove(key);

		} else {
			if (cache.size() == cacheCapacity) {
				cache.remove(cache.stream().findFirst().get());
			}
		}
		cache.add(key);
		System.out.println("Current state --> " + cache.toString());
	}

	public static void main(String[] args) {
		LRUCacheWithoutDeque lruCache = new LRUCacheWithoutDeque(3);
		lruCache.getCache("One");
		lruCache.getCache("Two");
		lruCache.getCache("One");
		lruCache.getCache("Three");
		lruCache.getCache("Four");
		lruCache.getCache("Three");
	}

}

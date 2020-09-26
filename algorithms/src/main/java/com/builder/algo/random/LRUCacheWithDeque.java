package com.builder.algo.random;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class LRUCacheWithDeque {

	private Deque<String> deque;
	private Set<String> cache;

	private int cacheCapacity;

	public LRUCacheWithDeque(int cacheCapacity) {
		this.cacheCapacity = cacheCapacity;
		deque = new ArrayDeque<String>();
		cache = new HashSet<String>();
	}

	public void getCache(String key) {

		if (cache.contains(key)) {
			deque.remove(key);
			cache.remove(key);
		} else {
			if (deque.size() == cacheCapacity) {
				deque.removeLast();
			}
			cache.add(key);
		}
		deque.push(key);
		System.out.println("Current state --> " + deque.toString());

	}

	public static void main(String[] args) {
		LRUCacheWithDeque lruCache = new LRUCacheWithDeque(3);
		lruCache.getCache("One");
		lruCache.getCache("Two");
		lruCache.getCache("One");
		lruCache.getCache("Three");
		lruCache.getCache("Four");
		lruCache.getCache("Three");
	}

}

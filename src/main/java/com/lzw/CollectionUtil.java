package com.lzw;

import java.util.Collection;

public class CollectionUtil {
	/**
	 * 
	 * @Title: isEmpty
	 * @Description: 判断集合是否有值。。。
	 * @return
	 * @return: boolean
	 */
	public static boolean isEmpty(Collection<?> collection) {
		return collection == null || collection.isEmpty();
	}

}

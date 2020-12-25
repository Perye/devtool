package com.perye.devtool.utils;

import java.util.Collection;
import java.util.Map;

/**
 * 验证工具类
 * 实现对象为空为NULL的判断
 * @author perye
 * @date 2020/12/25 17:17
 */
public class ValidateUtil {

    /**
     * 验证对象是否为NULL，null返回true,否则为false
     *
     * @param object 对象
     */
    public static boolean isNull(Object object) {
        return object == null;
    }

    /**
     * 验证字符串是否为空（包括null和空字符串的判断），为空返回true,否则为false
     *
     * @param text 字符串
     */
    public static boolean isEmpty(String text) {
        return text == null || text.trim().length() == 0;
    }

    /**
     * 验证对象数组是否为空，为空返回true,否则为false
     *
     * @param array 数组
     */
    public static boolean isEmpty(Object[] array) {
        return array == null || array.length == 0;
    }

    /**
     * 验证集合是否为空，为空返回true,否则为false
     *
     * @param collection 数组
     */
    public static boolean isEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    /**
     * 验证Map对象是否为空，为空返回true,否则为false
     *
     * @param map map对象
     */
    public static boolean isEmpty(Map<?, ?> map) {
        return map == null || map.isEmpty();
    }

}

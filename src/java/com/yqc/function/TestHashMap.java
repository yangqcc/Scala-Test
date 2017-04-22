package com.yqc.function;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yangqc on 2017/4/22.
 */
public class TestHashMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Spark", "excellent");
        map.put("MapReduce", "good");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}

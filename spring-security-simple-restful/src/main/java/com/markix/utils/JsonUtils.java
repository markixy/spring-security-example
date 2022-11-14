package com.markix.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author markix
 * @date 2022/7/18 23:46
 */
public class JsonUtils {

    private static final ObjectMapper om = new ObjectMapper();

    public static String toJsonString(Object obj){
        try {
            return om.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

}

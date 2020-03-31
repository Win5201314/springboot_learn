package com.zsl.springboot.demo.model;

import lombok.Data;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangshengli
 */
@Data
public class BaseEntity {

    private Long id;

    public static <T extends BaseEntity> Map<Long, T> idEntityMap(Collection<T> list) {
        Map<Long, T> map = new HashMap<>();
        if (null == list || 0 == list.size()) {
            return map;
        }
        for (T entity : list) {
            map.put(entity.getId(), entity);
        }
        return map;
    }

}

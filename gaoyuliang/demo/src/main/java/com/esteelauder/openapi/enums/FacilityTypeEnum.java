package com.esteelauder.openapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author gaoyuliang Facility Type Enum
 */

@Getter
@AllArgsConstructor
public enum FacilityTypeEnum {

    /**
     * 易捷到家
     */
    TRUCK(1,"TRUCK"),
    /**
     * 新能源
     */
    PUSH_CART(2,"PUSH CART");



    private final Integer code;
    private final String name;

    public static FacilityTypeEnum toType(Integer code) {
        for (FacilityTypeEnum p : values()) {
            if (p.code.equals(code)) {
                return p;
            }
        }
        return null;
    }
}

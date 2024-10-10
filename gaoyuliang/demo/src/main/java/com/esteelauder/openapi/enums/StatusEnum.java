package com.esteelauder.openapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author gaoyuliang Status Enum
 */

@Getter
@AllArgsConstructor
public enum StatusEnum {
    REQUESTED(1,"REQUESTED"),
    SUSPEND(2,"SUSPEND"),
    ISSUED(3,"ISSUED"),
    APPROVED(4,"APPROVED"),
    EXPIRED(5,"EXPIRED");

    private final Integer code;
    private final String name;

    public static StatusEnum toType(Integer code) {
        for (StatusEnum p : values()) {
            if (p.code.equals(code)) {
                return p;
            }
        }
        return null;
    }
}

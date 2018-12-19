package com.love.bean;

public enum CommonType {
    password(1),
    is_love(2),;

    private Integer value;

    CommonType(int value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}

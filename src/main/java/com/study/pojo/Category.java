package com.study.pojo;

public enum Category {
    COMMON("common"),
    DEUTSCH("deutsch");

    private String name;

    Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

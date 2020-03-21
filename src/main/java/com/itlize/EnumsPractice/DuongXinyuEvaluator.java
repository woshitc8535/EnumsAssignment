package com.itlize.EnumsPractice;

public class DuongXinyuEvaluator {
    private String name;

    public DuongXinyuEvaluator(String name) {
        this.name = name;
    }
    public boolean isDuong() {
        return this.name == "Duong";
    }
    public boolean isXinyu() {
        return this.name == "Xinyu";
    }
}

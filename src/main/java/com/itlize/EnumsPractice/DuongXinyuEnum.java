package com.itlize.EnumsPractice;

public enum DuongXinyuEnum {
    Duong("Duong"), Xinyu("Xinyu");

    private String name;

    DuongXinyuEnum(String name) {
        this.name = name;
    }

    public String getCatchPhrase() {
        return "Hey, my name is " + this.name + "!";
    }

    public boolean isDuong() {
        return this.name == "Duong";
    }

    public boolean isXinyu() {
        return this.name == "Xinyu";
    }
}

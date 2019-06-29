package com.beerontology.domain;

import java.io.Serializable;

public class Beer implements Serializable {
    private String style;
    private String brand;
    private String label;

    public Beer() {
    }

    public Beer(String brand, String style, String label) {
        this.style = style;
        this.label = label;
        this.brand = brand;
    }

    public String getStyle() {
        return style;
    }

    public String getBrand() {
        return brand;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", getBrand(), getStyle(), getLabel());
    }
}

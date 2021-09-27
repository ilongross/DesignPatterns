package com.ilongross.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ProductFactory {

    private static final Map<String, Size> sizeMap = new HashMap<>();
    private static final Map<String, Color> colorMap = new HashMap<>();

    static {
        sizeMap.put("S", new Size(28, "S"));
        sizeMap.put("M", new Size(28, "M"));
        sizeMap.put("L", new Size(28, "L"));
        sizeMap.put("XL", new Size(28, "XL"));
        sizeMap.put("XXL", new Size(28, "XXL"));

        colorMap.put("red", new Color(111, "Red"));
        colorMap.put("green", new Color(222, "Green"));
        colorMap.put("blue", new Color(333, "Blue"));

    }

    public static Product createProduct(String sizedName, String colorName, String name) {
        return new Product(name, sizeMap.get(sizedName), colorMap.get(colorName));
    }


}

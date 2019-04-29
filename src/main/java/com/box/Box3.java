package com.box;

public class Box3 implements Box {
    static float length;
    static float width;
    static float height;

    public Box3(float length, float width, float height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean validate(float length, float width, int height) {
        if((length > this.length)
                || (width > this.width)
                || (height > this.height)) {
            return false;
        } else {
            return true;
        }
    }
}

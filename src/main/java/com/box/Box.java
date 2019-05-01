package com.box;

public class Box {
    public float length;
    public float width;
    public float height;
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

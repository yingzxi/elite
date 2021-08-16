package com.gupao.elite.design.liskovsutiution.simple;

/**
 * @author: liyang
 * @time: 2021/8/16 13:21
 */
public class Square extends Rectangle{
    private long length;

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    @Override
    public long getHeight() {
        return length;
    }

    @Override
    public void setHeight(long height) {
        setLength(height);
    }

    @Override
    public long getWidth() {
        return length;
    }

    @Override
    public void setWidth(long width) {
        setLength(width);
    }
}

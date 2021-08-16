package com.gupao.elite.design.liskovsutiution;

/**
 * @author: liyang
 * @time: 2021/8/16 13:32
 */
public class Square implements QuadRangle{
    private long length;

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    @Override
    public long getWidth() {
        return length;
    }

    @Override
    public long getHeight() {
        return length;
    }
}

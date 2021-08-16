package com.gupao.elite.design.liskovsutiution;

/**
 * @author: liyang
 * @time: 2021/8/16 13:31
 */
public class Rectangle implements QuadRangle{

    private long height;
    private long weight;

    @Override
    public long getWidth() {
        return 0;
    }

    @Override
    public long getHeight() {
        return 0;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }
}

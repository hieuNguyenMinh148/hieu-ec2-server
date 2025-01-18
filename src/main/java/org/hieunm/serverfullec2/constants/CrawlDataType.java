package org.hieunm.serverfullec2.constants;

public enum CrawlDataType {

    VIDEO(1),
    IMAGE(2),
    REEL(3);

    private Integer type;

    CrawlDataType(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return type;
    }
}

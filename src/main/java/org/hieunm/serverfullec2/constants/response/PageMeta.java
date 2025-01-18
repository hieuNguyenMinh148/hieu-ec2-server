package org.hieunm.serverfullec2.constants.response;

import lombok.Data;

@Data
public class PageMeta {

    public PageMeta(int totalPage, int currentPage, int size, long total) {
        this.currentPage = currentPage + 1;
        this.totalPage = totalPage;
        this.size = size;
        this.total = total;
    }

    int totalPage;

    int currentPage;

    int size;

    long total;
}

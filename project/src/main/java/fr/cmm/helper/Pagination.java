package fr.cmm.helper;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class Pagination {
    // 1 based page index
    private int pageIndex = 1;

    private int pageSize;

    private long count;

    public int getPreviousPageIndex() {
        return isFirstPage() ? pageIndex : pageIndex - 1;
    }

    public int getNextPageIndex() {
        return isLastPage() ? pageIndex : pageIndex + 1;
    }

    public boolean isFirstPage() {
        return pageIndex == 1;
    }

    public boolean isLastPage() {
        return pageIndex * pageSize >= count;
    }

    public int getPageCount() {
        if (count == 0) {
            return 1;
        }

        if ((float) count / pageSize > (int) count / pageSize) {
            return (int) count / pageSize + 1;
        } else {
            return (int) count / pageSize;
        }
    }

    public List<Integer> getPages() {

        List<Integer> listedespages = new ArrayList<>();

        for (int i = 4; i > 0; i--) {
            if (this.pageIndex - i > 0 && this.pageIndex - i < this.getPageCount() + 1) {
                listedespages.add(this.getPageIndex() - i);
            }
        }
        listedespages.add(this.getPageIndex());
        for (int i = 1; i < 6; i++) {
            if (listedespages.size() < 11 && this.getPageIndex() + i < this.getPageCount() + 1) {
                listedespages.add(getPageIndex() + i);
            }
        }

        return listedespages;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
}

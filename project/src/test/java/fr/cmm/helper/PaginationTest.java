package fr.cmm.helper;

import fr.cmm.tags.Functions;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pomme on 18/12/2015.
 */
public class PaginationTest {




    @Test
    public void getPageCountMultiple() {
        Pagination pagination = new Pagination();
        pagination.setCount(40);
        pagination.setPageSize(20);
        assertEquals(2, pagination.getPageCount());
        // pas la peine de tester pageSize = 0 puique la taille de la page ne peut pas etre nulle


    }

    @Test
    public void getPageCountNonMultiple() {
        Pagination pagination = new Pagination();
        pagination.setCount(50);
        pagination.setPageSize(20);
        assertEquals(3, pagination.getPageCount());
        // pas la peine de tester pageSize = 0 puique la taille de la page ne peut pas etre nulle


    }
    @Test
    public void getPageCountNull() {
        Pagination pagination = new Pagination();
        pagination.setCount(0);
        pagination.setPageSize(20);
        assertEquals(1, pagination.getPageCount());
        // pas la peine de tester pageSize = 0 puique la taille de la page ne peut pas etre nulle


    }

    @Test
    public void getPageCountInfPageSize() {
        Pagination pagination = new Pagination();
        pagination.setCount(20);
        pagination.setPageSize(50);
        assertEquals(1, pagination.getPageCount());
        // pas la peine de tester pageSize = 0 puique la taille de la page ne peut pas etre nulle


    }


}